package com.cquiz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.SQLException;
import android.util.Log;


/**
 * Created by tushar on 7/19/2015.
 */
public class ExternalDbOpenHelper extends SQLiteOpenHelper{
    public static final String DB_Name = "CQuiz";
    public static final String Table_Name = "Records";


    public ExternalDbOpenHelper(Context context) {
        super(context, DB_Name, null, 1);
       SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, QUESTION TEXT , ANSWER1" +
                " TEXT , ANSWER2 TEXT,ANSWER3 TEXT, ANSWER4 TEXT , CORRECT_ANSWER INTEGER , EXPLANATION TEXT) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists " + Table_Name);
    }

    public void insertdata(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c= new ContentValues();
        c.put("QUESTION","What are the types of linkages?");
        c.put("ANSWER1","Internal and External");
        c.put("ANSWER2","External, Internal and None");
        c.put("ANSWER3","External and None");
        c.put("ANSWER4","Internal");
        c.put("CORRECT_ANSWER",2);
        long result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which of the following is not modifier of data type in c?");
        c.put("ANSWER1","extern");
        c.put("ANSWER2","interrupt");
        c.put("ANSWER3","huge");
        c.put("ANSWER4","All of these are modifiers of data type\t");
        c.put("CORRECT_ANSWER",4);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Consider on following declaration:\n" +
                "(i)        short i=10;\n" +
                "(ii)      static i=10;\n" +
                "(iii)    unsigned i=10;\n" +
                "(iv)      const i=10;\n" +
                "\n" +
                "Choose correct one:");
        c.put("ANSWER1","Only (iv) is incorrect");
        c.put("ANSWER2","Only (ii) and (iv) are incorrect");
        c.put("ANSWER3","Only (ii),(iii) and (iv) are correct");
        c.put("ANSWER4","All are correct declaration");
        c.put("CORRECT_ANSWER",4);
        c.put("EXPLANATION","Default data type of above all declaration is int.");
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","What will be output when you will execute following c code?\n" +
                "\n" +
                "#include<stdio.h>\n" +
                "int main(){\n" +
                "    int a= sizeof(signed) +sizeof(unsigned);\n" +
                "    int b=sizeof(const)+sizeof(volatile);\n" +
                "    printf(\"%d\",a+++b);\n" +
                "    return 0;\n" +
                "}");
        c.put("ANSWER1","10");
        c.put("ANSWER2","9");
        c.put("ANSWER3","8");
        c.put("ANSWER4","Error: Undefined operator +++");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","What will be output when you will execute following c code?\n" +
                "\n" +
                "#include<stdio.h>\n" +
                "int main(){\n" +
                "    signed x,a;\n" +
                "    unsigned y,b;\n" +
                "    a=(signed)10u;\n" +
                "    b=(unsigned)-10;\n" +
                "    y = (signed)10u + (unsigned)-10;\n" +
                "    x = y;\n" +
                "    printf(\"%d  %u\\t\",a,b);\n" +
                "    if(x==y)\n" +
                "         printf(\"%d %d\",x,y);\n" +
                "    else if(x!=y)\n" +
                "         printf(\"%u  %u\",x,y);\n" +
                "    return 0;\n" +
                "}");
        c.put("ANSWER1","10 -10   0 0");
        c.put("ANSWER2","10 -10   65516 -10");
        c.put("ANSWER3","10 -10   10 -10");
        c.put("ANSWER4","10 65526      0 0");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which of the following special symbol allowed in a variable name?");
        c.put("ANSWER1","* (asterisk)");
        c.put("ANSWER2","| (pipeline)");
        c.put("ANSWER3","- (hyphen)");
        c.put("ANSWER4","_ (underscore)");
        c.put("CORRECT_ANSWER",4);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","How would you round off a value from 1.66 to 2.0?");
        c.put("ANSWER1","ceil(1.66)");
        c.put("ANSWER2","floor(1.66)");
        c.put("ANSWER3","roundup(1.66)");
        c.put("ANSWER4","roundto(1.66)");
        c.put("CORRECT_ANSWER",1);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","What will happen if in a C program you assign a value to an array element whose subscript exceeds the size of array?");
        c.put("ANSWER1","The element will be set to 0.");
        c.put("ANSWER2","The compiler would report an error");
        c.put("ANSWER3","The program may crash if some important data gets overwritten");
        c.put("ANSWER4","The array size would appropriately grow.");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","What does the following declaration mean?\n" +
                "int (*ptr)[10];");
        c.put("ANSWER1","ptr is array of pointers to 10 integers");
        c.put("ANSWER2","ptr is a pointer to an array of 10 integers");
        c.put("ANSWER3","ptr is an array of 10 integers");
        c.put("ANSWER4","ptr is an pointer to array");
        c.put("CORRECT_ANSWER",2);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","In C, if you pass an array as an argument to a function, what actually gets passed?");
        c.put("ANSWER1","Value of elements in array");
        c.put("ANSWER2","First element of the array");
        c.put("ANSWER3","Base address of the array");
        c.put("ANSWER4","Address of the last element of array");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which of the following is not logical operator?");
        c.put("ANSWER1","&");
        c.put("ANSWER2","&&");
        c.put("ANSWER3","||");
        c.put("ANSWER4","!");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","In mathematics and computer programming, which is the correct order of mathematical operators ?\n" +
                "\n");
        c.put("ANSWER1","Addition, Subtraction, Multiplication, Division");
        c.put("ANSWER2","Division, Multiplication, Addition, Subtraction");
        c.put("ANSWER3","Multiplication, Addition, Division, Subtraction");
        c.put("ANSWER4","Addition, Division, Modulus, Subtraction");
        c.put("CORRECT_ANSWER",2);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which of the following cannot be checked in a switch-case statement?");
        c.put("ANSWER1","Character");
        c.put("ANSWER2","Integer");
        c.put("ANSWER3","Float");
        c.put("ANSWER4","enum");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which of the following is the correct order of evaluation for the below expression?\n" +
                "z = x + y * z / 4 % 2 - 1");
        c.put("ANSWER1","* / % + - =");
        c.put("ANSWER2","= * / % + -");
        c.put("ANSWER3","/ * % - + =");
        c.put("ANSWER4","* % / - + =");
        c.put("CORRECT_ANSWER",1);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which is valid C expression?");
        c.put("ANSWER1","int n = 10,000;");
        c.put("ANSWER2","int n = 100000;");
        c.put("ANSWER3","int n m = 10000");
        c.put("ANSWER4","int $m_n = 10000;");
        c.put("CORRECT_ANSWER",2);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which of the following is not a valid variable name declaration?");
        c.put("ANSWER1","float PI = 3.14;");
        c.put("ANSWER2","double PI = 3.14;");
        c.put("ANSWER3","int PI = 3.14;");
        c.put("ANSWER4","#define PI 3.14");
        c.put("CORRECT_ANSWER",4);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Which of the following cannot be a variable name in C?");
        c.put("ANSWER1","volatile");
        c.put("ANSWER2","true");
        c.put("ANSWER3","friend");
        c.put("ANSWER4","export");
        c.put("CORRECT_ANSWER",1);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION"," What will be output of\n" +
                "#include\n" +
                "void main()\n" +
                "{\n" +
                "char test =`S`;\n" +
                "printf(\"\\n%c\",test);\n" +
                "}");
        c.put("ANSWER1","S");
        c.put("ANSWER2","Error");
        c.put("ANSWER3","Garbage value");
        c.put("ANSWER4","None of above");
        c.put("CORRECT_ANSWER",1);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Consider the following program in C language:\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "main()\n" +
                "{\n" +
                "    int i;\n" +
                "    int *pi = &i;\n" +
                "    scanf(\"%d\", pi);\n" +
                "    printf(\"%d\\n\", i+5);\n" +
                "}");
        c.put("ANSWER1","Compilation fails.");
        c.put("ANSWER2","Execution results in a run-time error.");
        c.put("ANSWER3","On execution, the value printed is 5 more than the address of variable i.");
        c.put("ANSWER4","On execution, the value printed is 5 more than the integer value entered");
        c.put("CORRECT_ANSWER",4);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Consider the function func shown below:\n" +
                "\n" +
                "int func(int num)\n" +
                "{\n" +
                "    int count = 0;\n" +
                "    while (num)\n" +
                "    {\n" +
                "        count++;\n" +
                "        num >>= 1;\n" +
                "    }\n" +
                "    return (count);\n" +
                "}\n" +
                "The value returned by func(435)is __________.");
        c.put("ANSWER1","1");
        c.put("ANSWER2","9");
        c.put("ANSWER3","18");
        c.put("ANSWER4","4");
        c.put("CORRECT_ANSWER",2);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Consider the C function given below.\n" +
                "\n" +
                "int f(int j)\n" +
                "{\n" +
                "  static int i = 50;\n" +
                "  int k;\n" +
                "  if (i == j)\n" +
                "  {\n" +
                "    printf(\"something\");\n" +
                "    k = f(i);\n" +
                "    return 0;\n" +
                "  }\n" +
                "  else return 0;\n" +
                "}" +
                "Which of the following is true");
        c.put("ANSWER1","The function returns 0 for all values of j.");
        c.put("ANSWER2","The function prints the string something for all values of j.");
        c.put("ANSWER3","The function returns 0 when j = 50.");
        c.put("ANSWER4","The function will exhaust the runtime stack or run into an infinite loop when j = 50");
        c.put("CORRECT_ANSWER",4);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Consider the C function given below. Assume that the array listA contains n (> 0) elements, sorted in ascending order.\n" +
                "\n" +
                "int ProcessArray(int *listA, int x, int n)\n" +
                "{\n" +
                "    int i, j, k;\n" +
                "    i = 0;\n" +
                "    j = n-1;\n" +
                "    do{\n" +
                "        k = (i+j)/2;\n" +
                "        if (x <= listA[k])\n" +
                "            j = k-1;\n" +
                "        if (listA[k] <= x)\n" +
                "            i = k+1;\n" +
                "    } while (i <= j);\n" +
                "    if (listA[k] == x)\n" +
                "        return(k);\n" +
                "    else\n" +
                "        return -1;\n" +
                "}");
        c.put("ANSWER1","It will run into an infinite loop when x is not in listA.");
        c.put("ANSWER2","It is an implementation of binary search");
        c.put("ANSWER3","It will always find the maximum element in listA");
        c.put("ANSWER4","It will return -1 even when x is present in listA");
        c.put("CORRECT_ANSWER",2);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Consider the following function\n" +
                "\n" +
                "double f(double x)\n" +
                "{\n" +
                "   if (abs(x*x - 3) < 0.01) return x;\n" +
                "   else return f(x/2 + 1.5/x);\n" +
                "}\n" +
                "Give a value q (to 2 decimals) such that f(q) will return q:_____.");
        c.put("ANSWER1","1.765");
        c.put("ANSWER2","1.732");
        c.put("ANSWER3","1");
        c.put("ANSWER4","2");
        c.put("CORRECT_ANSWER",2);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","Let A be a square matrix of size n x n. Consider the following program. What is the expected output?\n" +
                "\n" +
                "C = 100\n" +
                "for i = 1 to n do\n" +
                "    for j = 1 to n do\n" +
                "    {\n" +
                "        Temp = A[i][j] + C\n" +
                "        A[i][j] = A[j][i]\n" +
                "        A[j][i] = Temp - C\n" +
                "    }\n" +
                "for i = 1 to n do\n" +
                "    for j = 1 to n do\n" +
                "        Output(A[i][j]);");
        c.put("ANSWER1","The matrix A itself");
        c.put("ANSWER2","Transpose of matrix A");
        c.put("ANSWER3","Adding 100 to the upper diagonal elements and subtracting 100 from diagonal elements of A");
        c.put("ANSWER4","None of the above");
        c.put("CORRECT_ANSWER",1);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","The minimum number of arithmetic operations required to evaluate the polynomial P(X) = X5 + 4X3 + 6X + 5 for a given value of X using only one temporary variable.");
        c.put("ANSWER1","6");
        c.put("ANSWER2","7");
        c.put("ANSWER3","8");
        c.put("ANSWER4","9");
        c.put("CORRECT_ANSWER",2);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","You have an array of n elements. Suppose you implement quicksort by always choosing the central element of the array as the pivot. Then the tightest upper bound for the worst case performance is");
        c.put("ANSWER1","O(n2)");
        c.put("ANSWER2","O(nLogn)");
        c.put("ANSWER3","O(nLogn)");
        c.put("ANSWER4","O(n)");
        c.put("CORRECT_ANSWER",1);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);
        c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);c.put("QUESTION","this is the tenth QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER",3);
        result = db.insert(Table_Name,null,c);



    }

    public Cursor getData(int  id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from  Records where id = " + id, null);
        return  res;
    }

}
