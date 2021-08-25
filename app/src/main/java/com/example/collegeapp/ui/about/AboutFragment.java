package com.example.collegeapp.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {
    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_about, container, false);
        list=new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_computer,"Computer Science","The Computer Engineering department was established in the year 2000 with intake of 60. In keeping view with the curriculum of the University of Pune, subjects like Distributed system, Network Information and Security, Artificial Intelligence and Computer Networks and Communications are taught here.The objective of the department is to impart quality education in Computer Engineering that can equip the budding engineers with right knowledge and propel them to the path of success in the country and abroad. The long term goal of the department is to harness the skills of faculty and students to create a technically sound learning environment that can be beneficial to the industry, society and in the field of technical innovation."));
        list.add(new BranchModel(R.drawable.ic_it,"Information Technology","The department of Information Technology (IT) aims at developing technical and experimental skills in students along with logical thinking so as to prepare them for competent, responsible and rewarding careers in IT profession. We strive to achieve the aim with young, dynamic and highly qualified faculty members, state of art infrastructure and Industry-Institution Interaction.The department has laboratories which are well equipped with latest configuration machines, high speed internet, Wi-Fi and legal licensed software. Modern aids such as LCD, Educational CDs make classroom teaching more interesting."));
        list.add(new BranchModel(R.drawable.ic_electronic,"EnTC","Electronics and Telecommunication Engg. Department was established in the year 2001 with the intake of 60 students. With the increase in intake of 60 in 2006-07 for UG and a new PG course of intake 18 in 2013-14; our department is continuously getting upgraded. Department has highly qualified faculty. Well planned infrastructure to satisfy growing needs of educational environment, supported with latest hardware and software tools like MATLAB, Xilinx, and LABVIEW etc. The aim of the faculty apart from imparting quality education in classrooms & laboratories is to include technical creativity in their students. State of the art excellent facilities are provided in the department to facilitate the staff to achieve this aim. The E&TC department tries to give each student an edge over other as they can set their feet in today’s highly competitive age"));
        adapter=new BranchAdapter(getContext(),list);
        viewPager=view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        ImageView imageView=view.findViewById(R.id.college_image);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/admin-college-apps.appspot.com/o/gallery%2F%5BB%40be9f4f7jpg?alt=media&token=c77dd58e-a200-4a5a-89d3-48803052c9b2")
                .into(imageView);


        return view;


    }
}