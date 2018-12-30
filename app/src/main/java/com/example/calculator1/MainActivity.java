package com.example.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private static StringBuilder show_text;
    private static ArrayList equation;
    int pointcheck=0;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_text=new StringBuilder();
        equation=new ArrayList<>();

        final EditText result=(EditText)findViewById(R.id.result);
        Button zero=(Button)findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!(show_text.equals("0"))){
                    show_text.append("0");
                    result.setText(show_text);
                }
            }
        });
        Button one=(Button)findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("1");
                result.setText(show_text);
            }
        });
        Button two=(Button)findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("2");
                result.setText(show_text);
            }
        });
        Button three=(Button)findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("3");
                result.setText(show_text);
            }
        });
        Button four=(Button)findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("4");
                result.setText(show_text);
            }
        });
        Button five=(Button)findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("5");
                result.setText(show_text);
            }
        });
        Button six=(Button)findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("6");
                result.setText(show_text);
            }
        });
        Button seven=(Button)findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("7");
                result.setText(show_text);
            }
        });
        Button eight=(Button)findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("8");
                result.setText(show_text);
            }
        });
        Button nine=(Button)findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.append("9");
                result.setText(show_text);
            }
        });
        final Button point=(Button)findViewById(R.id.spot);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()>0) {
                    char temp = show_text.charAt(show_text.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '.' || temp == '√')
                        show_text.deleteCharAt(show_text.length() - 1);
                }
                if(pointcheck==0)
                    show_text.append(".");
                pointcheck=1;
                result.setText(show_text);
            }
        });
        Button add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()>0) {
                    char temp = show_text.charAt(show_text.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '.' || temp == '√')
                        show_text.deleteCharAt(show_text.length() - 1);
                }
                show_text.append("+");
                pointcheck=0;
                result.setText(show_text);
            }
        });
        Button sub=(Button)findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()>0) {
                    char temp = show_text.charAt(show_text.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '.' || temp == '√')
                        show_text.deleteCharAt(show_text.length() - 1);
                }
                show_text.append("-");
                pointcheck=0;
                result.setText(show_text);
            }
        });
        Button mul=(Button)findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()>0) {
                    char temp = show_text.charAt(show_text.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '.' || temp == '√')
                        show_text.deleteCharAt(show_text.length() - 1);
                }
                show_text.append("*");
                pointcheck=0;
                result.setText(show_text);
            }
        });
        Button div=(Button)findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()>0) {
                    char temp = show_text.charAt(show_text.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '.' || temp == '√')
                        show_text.deleteCharAt(show_text.length() - 1);
                }
                show_text.append("/");
                pointcheck=0;
                result.setText(show_text);
            }
        });
        Button dec=(Button)findViewById(R.id.dec);
        Button cls=(Button)findViewById(R.id.cls);
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.delete(0,show_text.length());
                equation.clear();
                pointcheck=0;
                result.setText("");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()!=0){
                    if(show_text.charAt(show_text.length()-1)=='.')
                        pointcheck=0;
                    show_text.deleteCharAt(show_text.length()-1);
                    result.setText(show_text);
                }else
                    result.setText("");
            }
        });
        Button sqrt=(Button)findViewById(R.id.sqrt);
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()>0) {
                    char temp = show_text.charAt(show_text.length() - 1);
                    if (temp == '√' || temp == '.')
                        show_text.deleteCharAt(show_text.length() - 1);
                }
                show_text.append("√");
                pointcheck=0;
                result.setText(show_text);
            }
        });
        Button swi=(Button)findViewById(R.id.swi);
        swi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()>0){
                    char temp = show_text.charAt(show_text.length() - 1);
                    StringBuilder p = new StringBuilder();
                    if(temp>='0'&&temp<='9'){
                          while(show_text.charAt(show_text.length()-1)>='0'&&
                                show_text.charAt(show_text.length()-1)<='9'||show_text.charAt(show_text.length()-1)=='.'){
                            p.append(show_text.charAt(show_text.length()-1));
                            show_text.deleteCharAt(show_text.length() - 1);
                            if(show_text.length()==0)
                                break;
                        }
                        if(show_text.length()==1&&show_text.charAt(0)=='-'){
                            show_text.deleteCharAt(show_text.length() - 1);
                            for(int j=p.length()-1;j>=0;j--)
                                show_text.append(p.charAt(j));
                        }else{
                        show_text.append('(');
                        show_text.append('-');
                        for(int j=p.length()-1;j>=0;j--)
                            show_text.append(p.charAt(j));
                        show_text.append(')');}
                    }else if(temp==')'){
                        show_text.deleteCharAt(show_text.length()-1);
                        while(show_text.charAt(show_text.length()-1)>='0'&&show_text.charAt(show_text.length()-1)<='9'||show_text.charAt(show_text.length()-1)=='.'){
                            p.append(show_text.charAt(show_text.length()-1));
                            show_text.deleteCharAt(show_text.length() - 1);
                            if(show_text.length()==0)
                                break;
                        }
                        show_text.deleteCharAt(show_text.length()-1);
                        show_text.deleteCharAt(show_text.length()-1);
                        for(int j=p.length()-1;j>=0;j--)
                            show_text.append(p.charAt(j));
                    }
                }
                result.setText(show_text);
            }
        });
        final Button equal=(Button)findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_text.length()==0){
                    show_text.delete(0,show_text.length());
                    equation.clear();
                    Toast.makeText(MainActivity.this,"请先输入算式！",Toast.LENGTH_SHORT).show();
                    result.setText("");
                }else{
                    char temp=show_text.charAt(show_text.length()-1);
                    char _temp=show_text.charAt(0);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/'|| temp=='√'||_temp=='*'||_temp=='/'){
                        Toast.makeText(MainActivity.this,"表达式输入错误，请重新输入！",Toast.LENGTH_SHORT).show();
                        show_text.delete(0,show_text.length());
                        equation.clear();
                        result.setText("");
                        }
                    StringBuilder p1=new StringBuilder();
                    for(int i=0;i<show_text.length();i++){
                        if(show_text.charAt(i)>='0'&&show_text.charAt(i)<='9'||show_text.charAt(i)=='.'){
                            p1.append(String.valueOf(show_text.charAt(i)));
                            if(i>0){
                                if(show_text.charAt(i-1)==')'){
                                    Toast.makeText(MainActivity.this,"表达式输入错误，请重新输入！",Toast.LENGTH_SHORT).show();
                                    show_text.delete(0,show_text.length());
                                    equation.clear();
                                    result.setText("");
                                    return;
                                }
                            }
                        }else if(i==0&&show_text.charAt(i)=='+'){
                            continue;
                        }else if(i==0&&show_text.charAt(i)=='-'){
                            p1.append(String.valueOf(show_text.charAt(i)));
                        } else if(show_text.charAt(i)=='('){
                            i++;
                            while(true) {
                                p1.append(show_text.charAt(i));
                                i++;
                                if(show_text.charAt(i)==')')
                                    break;
                            }
                        } else if(show_text.charAt(i)=='√'){
                            if(i==0){
                                equation.add("1");
                                equation.add(String.valueOf(show_text.charAt(i)));
                            } else{
                                if(show_text.charAt(i-1)>='0'&&show_text.charAt(i-1)<='9'){
                                    equation.add(p1.toString());
                                p1.delete(0,p1.length());
                                equation.add(String.valueOf(show_text.charAt(i)));
                                }else{
                                    equation.add("1");
                                    equation.add(String.valueOf(show_text.charAt(i)));
                                }
                            }
                        } else {
                            equation.add(p1.toString());
                            p1.delete(0,p1.length());
                            equation.add(String.valueOf(show_text.charAt(i)));
                        }
                    }
                    equation.add(p1.toString());
                    equation.add("#");
                    String p2="";
                    try {
                         p2 = calculate(equation);
                        if(result.equals("")) {
                            Toast.makeText(MainActivity.this,"表达式输入错误，请重新输入！",Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this,"表达式输入错误，请重新输入！",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    result.setText(p2);
                    for(int i=0;i<p2.length();i++){
                        if(p2.charAt(i)=='.'){
                            pointcheck=1;
                            break;
                        }
                    }
                    show_text.delete(0,show_text.length());
                    equation.clear();
                    show_text.append(p2);
                }
            }


    protected boolean operatorPriorityCompare(char operator1,char operator2) {
        int o1=0;
        int o2=0;
        switch (operator1){
            case '+':{o1=0;break;}
            case '-':{o1=0;break;}
            case '*':{o1=1;break;}
            case '/':{o1=1;break;}
            case '√':{o1=2;break;}
        }
        switch (operator2){
            case '+':{o2=0;break;}
            case '-':{o2=0;break;}
            case '*':{o2=1;break;}
            case '/':{o2=1;break;}
            case '√':{o2=2;break;}
        }
        if(o1<=o2)
            return false;
        else
            return true;
    }

    public  double Add(double d1,double d2) {
        return d1+d2;
    }

    public  double Sub(double d1,double d2){
        return d1-d2;
    }

    public  double Mul(double d1,double d2){
        return d1*d2;
    }

    public  double Div(double d1,double d2){

        return d1/d2;
    }

    public  double Sqrt(double d1,double d2){
        return d1*Math.sqrt(d2);
    }

    protected String calculate(ArrayList equation){
        Double p1;
        Double p2;
        Double result;
        ArrayList operation=new ArrayList();
        ArrayList figure=new ArrayList();
        for(int i=0;i<equation.size();i++) {
            String p3=(String) equation.get(i);
            if(p3.equals("+")||p3.equals("-")||p3.equals("*")||p3.equals("/")||p3.equals("√")) {
                if(operation.size()>0) {
                    String p4=operation.get(operation.size()-1).toString();
                    while(!(operatorPriorityCompare(p3.charAt(0),p4.charAt(0)))&&operation.size()>0) {
                        operation.remove(operation.size()-1);
                        p2=(Double.parseDouble(figure.get(figure.size()-1).toString()));
                        figure.remove(figure.size()-1);
                        p1=(Double.parseDouble(figure.get(figure.size()-1).toString()));
                        figure.remove(figure.size()-1);
                        switch (p4.charAt(0)){
                            case '+':
                                result=Add(p1,p2);
                                figure.add(String.valueOf(result));
                                break;
                            case '-':
                                result=Sub(p1,p2);
                                figure.add(String.valueOf(result));
                                break;
                            case '*':
                                result=Mul(p1,p2);
                                figure.add(String.valueOf(result));
                                break;
                            case '/':
                                if(p2==0){
                                    Toast.makeText(MainActivity.this,"除数不能为0",Toast.LENGTH_SHORT).show();
                                    return "";
                                }
                                result=Div(p1,p2);
                                figure.add(String.valueOf(result));
                                break;
                            case '√':
                                if(p2<=0){
                                    Toast.makeText(MainActivity.this,"负数不能开方",Toast.LENGTH_SHORT).show();
                                    return "";
                                }
                                result=Sqrt(p1,p2);
                                figure.add(String.valueOf(result));
                                break;
                            }
                        if(operation.size()>0)
                            p4=operation.get(operation.size()-1).toString();
                        else
                            break;
                    }
                    operation.add(p3);
                }
                else
                    operation.add(p3);
            } else if(p3.equals("#")) {
                while(operation.size()>0) {
                    String p5=(String)operation.get(operation.size()-1);
                    operation.remove(operation.size()-1);
                    p2=(Double.parseDouble(figure.get(figure.size()-1).toString()));
                    figure.remove(figure.size()-1);
                    p1=(Double.parseDouble(figure.get(figure.size()-1).toString()));
                    figure.remove(figure.size()-1);
                    switch (p5.charAt(0)){
                        case '+':
                            result=Add(p1,p2);
                            figure.add(String.valueOf(result));
                            break;
                        case '-':
                            result=Sub(p1,p2);
                            figure.add(String.valueOf(result));
                            break;
                        case '*':
                            result=Mul(p1,p2);
                            figure.add(String.valueOf(result));
                            break;
                        case '/':
                            if(p2==0){
                                Toast.makeText(MainActivity.this,"除数不能为0",Toast.LENGTH_SHORT).show();
                                return "";
                            }
                            result=Div(p1,p2);
                            figure.add(String.valueOf(result));
                            break;
                        case '√':
                            if(p2<=0){
                                Toast.makeText(MainActivity.this,"负数不能开方",Toast.LENGTH_SHORT).show();
                                return "";
                            }
                            result=Sqrt(p1,p2);
                            figure.add(String.valueOf(result));
                            break;
                    }
                }
            }
            else
                figure.add(p3);
        }
        return figure.get(0).toString();
    }

    });
}}