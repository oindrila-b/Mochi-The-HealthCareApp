package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link signup_tab_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class signup_tab_fragment extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public signup_tab_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment signup_tab_fragment.
     */
    // TODO: Rename and change types and number of parameters
    Button button;
    EditText email;
    EditText PASS;
    EditText mobile;
    EditText confpass;
    FirebaseAuth auth;


    public static signup_tab_fragment newInstance(String param1, String param2) {
        signup_tab_fragment fragment = new signup_tab_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root= (ViewGroup) inflater.inflate(R.layout.fragment_signup_tab_fragment, container, false);
        button= root.findViewById(R.id.button);
        email = root.findViewById(R.id.email);
        PASS = root.findViewById(R.id.PASS);
        confpass = root.findViewById(R.id.confpass);
        mobile = root.findViewById(R.id.mobile);
        auth =FirebaseAuth.getInstance();

        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email =email.getText().toString();
                String txt_password=PASS.getText().toString();
                String txt_confpass=confpass.getText().toString();
                if(TextUtils.isEmpty(txt_email)|| TextUtils.isEmpty(txt_password)||TextUtils.isEmpty(mobile.getText().toString())||TextUtils.isEmpty(txt_confpass)){
                    Toast.makeText(getContext(),"Empty credentials",Toast.LENGTH_SHORT).show();
                }else if(txt_password.length() <6) {
                    Toast.makeText(getContext(), "Password too short", Toast.LENGTH_SHORT).show();
                }
                else if(!txt_password.equals(txt_confpass)){
                        Toast.makeText(getContext(),"Both passwords different",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(),"Loading...",Toast.LENGTH_SHORT).show();
                    auth.createUserWithEmailAndPassword(txt_email,txt_password).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(getContext(),"signup successful",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getContext(),MainActivity.class));
                                getActivity().finish();
                            }else{
                                Toast.makeText(getContext(),"signup failed",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        }));

        return root;
    }

}