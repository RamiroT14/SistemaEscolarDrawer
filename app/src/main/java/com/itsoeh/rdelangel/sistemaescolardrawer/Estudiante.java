package com.itsoeh.rdelangel.sistemaescolardrawer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Estudiante#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Estudiante extends Fragment {

    private Button btnR1,btnR2,btnR3,btnR4,btnR5,btnR6,btnR7;
    private TextView txtR1,txtR2,txtR3,txtR4,txtR5,txtR6, txtR7;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Estudiante() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Estudiante.
     */
    // TODO: Rename and change types and number of parameters
    public static Estudiante newInstance(String param1, String param2) {
        Estudiante fragment = new Estudiante();
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
        return inflater.inflate(R.layout.fragment_estudiante, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnR1=view.findViewById(R.id.exam_btn_resp1);
        txtR1 = view.findViewById(R.id.exam_txt_resp1);
        txtR2 = view.findViewById(R.id.exam_txt_resp2);
        txtR7= view.findViewById(R.id.exam_btn_resp7);
        btnR7=view.findViewById(R.id.exam_btn_resp7);
        btnR7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicResp7();

            }
        });
        btnR2=view.findViewById(R.id.exam_btn_resp2);
        btnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicResp2();
            }
        });
        txtR3 = view.findViewById(R.id.exam_txt_resp3);
        btnR3=view.findViewById(R.id.exam_btn_resp3);
        btnR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicResp3();
            }
        });
        txtR4 = view.findViewById(R.id.exam_txt_resp4);
        btnR4= view.findViewById(R.id.exam_btn_resp4);
        btnR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicResp4();
            }
        });
        txtR5 = view.findViewById(R.id.exam_txt_resp5);
        btnR5=view.findViewById(R.id.exam_btn_resp5);
        btnR5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicResp5();
            }
        });
        txtR6 = view.findViewById(R.id.exam_txt_resp6);
        btnR6 = view.findViewById(R.id.exam_btn_resp6);
        btnR6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicResp6();
            }
        });
        btnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicResp1();
            }
        });
    }

    private void clicResp7() {
        final String[] opciones1 = {"15", "10", "5"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Selecciona una opción")
                .setSingleChoiceItems(opciones1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String seleccion = opciones1[which];
                        txtR7.setText(seleccion);
                        Toast.makeText(getView().getContext(), "Opción seleccionada: " + seleccion, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    private void clicResp6() {
        final String[] opciones1 = {"15", "10", "5"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Selecciona una opción")
                .setSingleChoiceItems(opciones1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String seleccion = opciones1[which];
                        txtR6.setText(seleccion);
                        Toast.makeText(getView().getContext(), "Opción seleccionada: " + seleccion, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private void clicResp5() {
        final String[] opciones1 = {"15", "10", "5"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Selecciona una opción")
                .setSingleChoiceItems(opciones1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String seleccion = opciones1[which];
                        txtR5.setText(seleccion);
                        Toast.makeText(getView().getContext(), "Opción seleccionada: " + seleccion, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private void clicResp4() {
        final String[] opciones1 = {"15", "10", "5"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Selecciona una opción")
                .setSingleChoiceItems(opciones1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String seleccion = opciones1[which];
                        txtR4.setText(seleccion);
                        Toast.makeText(getView().getContext(), "Opción seleccionada: " + seleccion, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private void clicResp3() {
        final String[] opciones1 = {"15", "10", "5"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Selecciona una opción")
                .setSingleChoiceItems(opciones1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String seleccion = opciones1[which];
                        txtR3.setText(seleccion);
                        Toast.makeText(getView().getContext(), "Opción seleccionada: " + seleccion, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    private void clicResp2() {
        final String[] opciones1 = {"15", "10", "5"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Selecciona una opción")
                .setSingleChoiceItems(opciones1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String seleccion = opciones1[which];
                        txtR2.setText(seleccion);
                        Toast.makeText(getView().getContext(), "Opción seleccionada: " + seleccion, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void clicResp1() {
        final String[] opciones1 = {"15", "10", "5"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Selecciona una opción")
                .setSingleChoiceItems(opciones1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String seleccion = opciones1[which];
                        txtR1.setText(seleccion);
                        Toast.makeText(getView().getContext(), "Opción seleccionada: " + seleccion, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}