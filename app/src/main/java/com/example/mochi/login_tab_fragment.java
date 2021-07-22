package com.example.mochi;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link login_tab_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class login_tab_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // Initializing variables
    EditText email;
    EditText pass;
    Button button;
    TextView forgotpass;
    float v =0;

    FirebaseAuth auth;


    public login_tab_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment login_tab_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static login_tab_fragment newInstance(String param1, String param2) {
        login_tab_fragment fragment = new login_tab_fragment();
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
        ViewGroup root=(ViewGroup) inflater.inflate(R.layout.fragment_login_tab_fragment, container, false);

        email=root.findViewById(R.id.email);
        pass=root.findViewById(R.id.pass);
        forgotpass=root.findViewById(R.id.forgotpass);
        button=root.findViewById(R.id.button);

        auth = FirebaseAuth.getInstance();

        email.setTranslationX(800);
        pass.setTranslationX(800);
        forgotpass.setTranslationX(800);
        button.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        forgotpass.setAlpha(v);
        button.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(100).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(200).start();
        forgotpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(200).start();
        button.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email = email.getText().toString();
                String txt_password = pass.getText().toString();
                if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)) {
                    Toast.makeText(getContext(), "Enter details", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(),"Loading...",Toast.LENGTH_SHORT).show();
                    auth.signInWithEmailAndPassword(txt_email, txt_password).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(getContext(),"login successful",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getContext(),MainActivity.class));
                                getActivity().finish();
                            }else{
                                Toast.makeText(getContext(),"login failed",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });



        return root;
    }
}