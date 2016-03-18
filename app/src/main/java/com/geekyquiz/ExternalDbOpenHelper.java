package com.geekyquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.geekyquiz.constants.Constants;


/**
 * Created by tushar on 7/19/2015.
 */
public class ExternalDbOpenHelper extends SQLiteOpenHelper {
    public static final String DB_Name = "CQuiz";
    public static final String Table_Name = "Records";
    public static final int db_version = 2;

    public ExternalDbOpenHelper(Context context) {
        super(context, DB_Name, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, QUESTION TEXT , ANSWER1" +
                " TEXT , ANSWER2 TEXT,ANSWER3 TEXT, ANSWER4 TEXT , CORRECT_ANSWER INTEGER , EXPLANATION TEXT) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertdata() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("QUESTION", "Advantage of Arrays over linked list?");
        c.put("ANSWER1", "Faster access to the elements");
        c.put("ANSWER2", "Fixed size");
        c.put("ANSWER3", "Insertion of new elements is easier in any position");
        c.put("ANSWER4", "Array size cant grow dynamically");
        c.put("CORRECT_ANSWER", 1);
        long result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "This code is for:\n" +
                "\tvoid function(struct node * head)\n" +
                "\t{\n" +
                "\t\twhile(head!=NULL)\n" +
                "\t\t{\n" +
                "\t\t    printf(\"%d\",head->data);\n" +
                "\t\t    head = head->next;\n" +
                "\t\t}\n" +
                "\t}\n");
        c.put("ANSWER1", "insert into linked list");
        c.put("ANSWER2", "traverse a linked list");
        c.put("ANSWER3", "delete an element in linked list");
        c.put("ANSWER4", "count number of elements in linked list");
        c.put("CORRECT_ANSWER", 2);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "This code is for:\n" +
                "\tstruct node * function(struct node * head,int data)\n" +
                "\t{\n" +
                "\t    struct node * temp = head;\n" +
                "\t    if(head->data == data)\n" +
                "\t    {\n" +
                "\t\treturn head->next;\n" +
                "\t    }\n" +
                "\t    while(head!=NULL)\n" +
                "\t    {\n" +
                "\n" +
                "\t\tif(head->next->data == data)\n" +
                "\t\t{\n" +
                "\t\t    head->next = head->next->next;\n" +
                "\t\t}\n" +
                "\t\thead=head->next;\n" +
                "\t    }\n" +
                "\t    return temp;\n" +
                "\t}");
        c.put("ANSWER1", "insert into linked list");
        c.put("ANSWER2", "traverse a linked list");
        c.put("ANSWER3", "delete an element in linked list");
        c.put("ANSWER4", "count number of elements in linked list");
        c.put("CORRECT_ANSWER", 3);
        c.put("EXPLANATION", "Default data type of above all declaration is int.");
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "This code is for:\n" +
                "\tint count=0;\n" +
                "\t\twhile(head!=NULL)\n" +
                "\t\t{\n" +
                "\t\t    head = head->next;\n" +
                "\t\t    count++;\n" +
                "\t\t}\n" +
                "\tprintf(\"%d\",count);");
        c.put("ANSWER1", "insert into linked list");
        c.put("ANSWER2", "traverse a linked list");
        c.put("ANSWER3", "delete an element in linked list");
        c.put("ANSWER4", "count number of elements in linked list");
        c.put("CORRECT_ANSWER", 4);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "This code is for:\n" +
                "\tstruct node * function(int data,struct node * head)\n" +
                "\t{\n" +
                "\t    struct node * new_node = head;\n" +
                "\t    struct node * temp= (struct node *)malloc(sizeof(struct node));\n" +
                "\t    temp->data = data;\n" +
                "\t    temp->next = NULL;\n" +
                "\t    while(new_node->next != NULL)\n" +
                "\t    {\n" +
                "\t       new_node = new_node->next;\n" +
                "\t    }\n" +
                "\t    new_node->next = temp;\n" +
                "\t    return head;\n" +
                "\n" +
                "\t}");
        c.put("ANSWER1", "insert into linked list");
        c.put("ANSWER2", "traverse a linked list");
        c.put("ANSWER3", "delete an element in linked list");
        c.put("ANSWER4", "count number of elements in linked list");
        c.put("CORRECT_ANSWER", 1);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "Time complexity to insert a node at the end of linked list?");
        c.put("ANSWER1", "O(1)");
        c.put("ANSWER2", "O(n)");
        c.put("ANSWER3", "O(n^2)");
        c.put("ANSWER4", "O(nlogn)");
        c.put("CORRECT_ANSWER", 2);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "Time required to access an element in linked list is of order?");
        c.put("ANSWER1", "O(1)");
        c.put("ANSWER2", "O(n)");
        c.put("ANSWER3", "O(n^2)");
        c.put("ANSWER4", "O(nlogn)");
        c.put("CORRECT_ANSWER", 2);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "Time complexity to insert a node before head of linked list is?");
        c.put("ANSWER1", "O(1)");
        c.put("ANSWER2", "O(n)");
        c.put("ANSWER3", "O(n^2)");
        c.put("ANSWER4", "O(nlogn)");
        c.put("CORRECT_ANSWER", 1);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "Time complexity of bubble sorting is ?");
        c.put("ANSWER1", "O(1)");
        c.put("ANSWER2", "O(n)");
        c.put("ANSWER3", "O(n^2)");
        c.put("ANSWER4", "O(nlogn)");
        c.put("CORRECT_ANSWER", 3);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "void function(struct node** head_ref)\n" +
                "\t{\n" +
                "\t    struct node* curr = *head_ref;\n" +
                "\t    struct node* nextValue;\n" +
                "\t    struct node* prevValue;\n" +
                "\t    while(curr!=NULL)\n" +
                "\t    {\n" +
                "\t\t      nextValue = curr->next;\n" +
                "\t\t      curr->next = prevValue;\n" +
                "\t\t      prevValue = curr;\n" +
                "\t\t      curr = nextValue;\n" +
                "\t    }\n" +
                "\t    *head_ref = prevValue;\n" +
                "\n" +
                "\t}");
        c.put("ANSWER1", "insert data in linked list");
        c.put("ANSWER2", "reverse a linked list");
        c.put("ANSWER3", "printing reverse of linked list");
        c.put("ANSWER4", "sort a linked list");
        c.put("CORRECT_ANSWER", 2111111);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "This is a recursive call :\n" +
                "\n" +
                "void function(int n){\n" +
                "    if(n == 0){\n" +
                "        return;\n" +
                "    }\n" +
                "    function(n-1);\n" +
                "    printf(\"%d \",n);\n" +
                "}");
        c.put("ANSWER1", "1 2 3 4 5");
        c.put("ANSWER2", "5 4 3 2 1");
        c.put("ANSWER3", "None of these");
        c.put("ANSWER4", "segmentation fault");
        c.put("CORRECT_ANSWER", 1);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "This is a recursive call :\n" +
                "\n" +
                "void function(int n){\n" +
                "    if(n == 0){\n" +
                "        return;\n" +
                "    }\n" +
                "    printf(\"%d \",n);\n" +
                "    function(n-1);\n" +
                "    what is the output if we call function(5)?\n" +
                "}");
        c.put("ANSWER1", "1 2 3 4 5");
        c.put("ANSWER2", "5 4 3 2 1");
        c.put("ANSWER3", "None of these");
        c.put("ANSWER4", "segmentation fault");
        c.put("CORRECT_ANSWER", 2);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "what will be the output of the   \n" +
                "\n" +
                "int function(int n,int *sum){\n" +
                "    if(n == 0){\n" +
                "        return 1;\n" +
                "    }\n" +
                "    *sum = function(n-1,sum) + *sum;\n" +
                "    return 1;\n" +
                "}\n" +
                "\n" +
                "if we call following \n" +
                "\n" +
                "    int sum = 0;\n" +
                "    function(10,&sum);\n" +
                "    printf(\"%d \",sum);");
        c.put("ANSWER1", "10");
        c.put("ANSWER2", "256");
        c.put("ANSWER3", "segmentation fault");
        c.put("ANSWER4", "9");
        c.put("CORRECT_ANSWER", 1);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "what will be the output of the   \n" +
                "\n" +
                "int function(int n,int *sum){\n" +
                "    if(n == 0){\n" +
                "        return 1;\n" +
                "    }\n" +
                "    *sum = function(n-1,sum) + *sum;\n" +
                "    return *sum;\n" +
                "}\n" +
                "\n" +
                "if we call following \n" +
                "\n" +
                "    int sum = 0;\n" +
                "    function(10,&sum);\n" +
                "    printf(\"%d \",sum);");
        c.put("ANSWER1", "10");
        c.put("ANSWER2", "256");
        c.put("ANSWER3", "segmentation fault");
        c.put("ANSWER4", "9");
        c.put("CORRECT_ANSWER", 2);
        result = db.insert(Table_Name, null, c);
        c.put("QUESTION", "what will be the return value for the function:\n" +
                "\n" +
                "int function(int n){\n" +
                "    static int i = 0;\n" +
                "    if(n<10){\n" +
                "    return ++i;\n" +
                "    }\n" +
                "    n = n/10;\n" +
                "    i = function(n);\n" +
                "    return ++i;\n" +
                "}\n" +
                "\n" +
                "for n = 123456;\n");
        c.put("ANSWER1", "61728");
        c.put("ANSWER2", "6");
        c.put("ANSWER3", "2");
        c.put("ANSWER4", "1");
        c.put("CORRECT_ANSWER", 2);
        result = db.insert(Table_Name, null, c);
        // Question number 16
        c.put(Constants.QUESTION, "what does the following function do when we pass root of a binary search tree\n" +
                "\tvoid function(struct node * root){\n" +
                "\t    if(root== NULL){\n" +
                "\t\treturn;\n" +
                "\t    }\n" +
                "\t    if(root->left == NULL){\n" +
                "\t\tprintf(\"%d\",root->data);\n" +
                "\t    }\n" +
                "\t    function(root->left);\n" +
                "\n" +
                "\t}");
        c.put(Constants.ANSWER1, "Inorder Traversal");
        c.put(Constants.ANSWER2, "preoder traversal");
        c.put(Constants.ANSWER3, "find maximum in the tree");
        c.put(Constants.ANSWER4, "find minimum in the tree");
        c.put(Constants.CORRECT_ANSWER, 4);
        result = db.insert(Table_Name, null, c);
        //Question number 17
        c.put(Constants.QUESTION, "Output of function when we pass \n" +
                "\tfun1(\"abcd\")\t\n" +
                "\n" +
                "\tint fun2(char str[], int i, int *l)\n" +
                "\t{\n" +
                "\t    if(str[i]=='\\0')\n" +
                "\t\treturn i;\n" +
                "\t    *l = *l + i;\n" +
                "\t    fun2(str, ++i, l);\n" +
                "\t}\n" +
                "\n" +
                "\tint fun1(char str[])\n" +
                "\t{\n" +
                "\t    int i=0;\n" +
                "\t    int l = 0;\n" +
                "\t    return fun2(str, i, &l);\n" +
                "\t}");
        c.put(Constants.ANSWER1, "1");
        c.put(Constants.ANSWER2, "2");
        c.put(Constants.ANSWER3, "dcba");
        c.put(Constants.ANSWER4, "4");
        c.put(Constants.CORRECT_ANSWER, 4);
        result = db.insert(Table_Name, null, c);
        //Question number 18
        c.put(Constants.QUESTION, "what will be the output of fun1 when we pass and array\n" +
                "\t2,1,3,4,9 and 5\n" +
                "\n" +
                "\tint fun2(int arr[], int n, int *s)\n" +
                "\t{\n" +
                "\t    if(n<0)\n" +
                "\t\treturn 0;\n" +
                "\t    *sum = *sum + arr[n];\n" +
                "\t    fun2(arr, --n, sum);\n" +
                "\n" +
                "\t}\n" +
                "\n" +
                "\tint fun1(int arr[], int n)\n" +
                "\t{\n" +
                "\t    int s=0;\n" +
                "\t    fun2(arr, n, &s);\n" +
                "\t    return s;\n" +
                "\t}");
        c.put(Constants.ANSWER1, "1");
        c.put(Constants.ANSWER2, "2");
        c.put(Constants.ANSWER3, "19");
        c.put(Constants.ANSWER4, "21");
        c.put(Constants.CORRECT_ANSWER, 3);
        result = db.insert(Table_Name, null, c);
        //Question number 19
        c.put(Constants.QUESTION, "Output of following function when we pass n = 20\n" +
                "\tvoid function(int n)\n" +
                "\t{\n" +
                "\t    if(n<0)\n" +
                "\t\treturn 0;\n" +
                "\t    int k = n-5;\n" +
                "\t    printf(\"%d \",k);\n" +
                "\t    function(k);\n" +
                "\t    printf(\"%d \",k);\n" +
                "\n" +
                "\t}");
        c.put(Constants.ANSWER1, "15 10 5 0 -5 -5 0 5 10 15");
        c.put(Constants.ANSWER2, "15 10 5 0");
        c.put(Constants.ANSWER3, "20 15 10 5 0 -5 -5 0 5 10 15 20");
        c.put(Constants.ANSWER4, "21");
        c.put(Constants.CORRECT_ANSWER, 1);
        result = db.insert(Table_Name, null, c);
        //Question number 20
        c.put(Constants.QUESTION, "What does following code do when we pass the root node of Binary Search tree\n" +
                "\tvoid function(struct node * root){\n" +
                "\t    if(root== NULL){\n" +
                "\t\treturn;\n" +
                "\t    }\n" +
                "\t    if(root->left == NULL){\n" +
                "\t\tprintf(\"%d\",root->data);\n" +
                "\t    }\n" +
                "\t    function(root->left);\n" +
                "\n" +
                "\t}");
        c.put(Constants.ANSWER1, "print nodes with right child only");
        c.put(Constants.ANSWER2, "print leaf nodes");
        c.put(Constants.ANSWER3, "print nodes with left child only");
        c.put(Constants.ANSWER4, "print smallest element in BST");
        c.put(Constants.CORRECT_ANSWER, 4);
        result = db.insert(Table_Name, null, c);
        //Question number 21
        c.put(Constants.QUESTION, "What does the following code do when we pass root node of binary search tree\n" +
                "\tvoid function(struct node * root){\n" +
                "\t\tif(root == NULL){\n" +
                "\t\t    return;\n" +
                "\t\t}\n" +
                "\t\tif((root->left == NULL && root->right != NULL) ||(root->left != NULL && root->right == NULL) ){\n" +
                "\t\t    printf(\"%d\",root->data);\n" +
                "\t\t}\n" +
                "\t\tfunction(root->left);\n" +
                "\t\tfunction(root->right);\n" +
                "\t}");
        c.put(Constants.ANSWER1, "Print nodes with only left child");
        c.put(Constants.ANSWER2, "Print nodes with only one child");
        c.put(Constants.ANSWER3, "Print nodes with only right child");
        c.put(Constants.ANSWER4, "none of the above");
        c.put(Constants.CORRECT_ANSWER, 2);
        result = db.insert(Table_Name, null, c);
        //Question number 22
        c.put(Constants.QUESTION, "What does the following code do when we pass root node of binary search tree\n" +
                "\tvoid function(struct node * root){\n" +
                "\t    if(root == NULL){\n" +
                "\t\treturn;\n" +
                "\t    }\n" +
                "\t    if(root->left == NULL && root->right == NULL){\n" +
                "\t\tprintf(\"%d\",root->data);\n" +
                "\t    }\n" +
                "\t    function(root->left);\n" +
                "\t    function(root->right);\n" +
                "\t}");
        c.put(Constants.ANSWER1, "prints leaves of tree");
        c.put(Constants.ANSWER2, "print internal nodes of the trees");
        c.put(Constants.ANSWER3, "print nodes on boundary of tree");
        c.put(Constants.ANSWER4, "print nodes with right child only");
        c.put(Constants.CORRECT_ANSWER, 1);
        result = db.insert(Table_Name, null, c);
        //Question Number 23
        c.put(Constants.QUESTION, "what does the following code do?\n" +
                "\tint function(struct node * root){\n" +
                "\t\tif(root == NULL)\n" +
                "\t\t   return 0;\n" +
                "\n" +
                "\t\tint l = function(root->left);\n" +
                "\t\tint r = function(root->right);\n" +
                "\n" +
                "\t\tif(l > r)\n" +
                "\t\t   return l + 1;\n" +
                "\t\telse\n" +
                "\t\t   return r + 1;\n" +
                "\n" +
                "\t}");
        c.put(Constants.ANSWER1, "returns number of nodes");
        c.put(Constants.ANSWER2, "returns diameter of tree");
        c.put(Constants.ANSWER3, "returns maximum depth of the tree");
        c.put(Constants.ANSWER4, "return number of nodes in straight line");
        c.put(Constants.CORRECT_ANSWER, 3);
        //Question Number 24
        c.put(Constants.QUESTION, " what is the traversal order of the following code?\n" +
                "void function(struct node * root){\n" +
                "\tif(root == NULL)\n" +
                "\t    return;\n" +
                "\n" +
                "\tprintf(\"%d\",root->data);\n" +
                "\tfunction(root->left);\n" +
                "\tfunction(root->right);\n" +
                "}\n");
        c.put(Constants.ANSWER1, "preorder");
        c.put(Constants.ANSWER2, "postorder");
        c.put(Constants.ANSWER3, "levelorder");
        c.put(Constants.ANSWER4, "inorder");
        c.put(Constants.CORRECT_ANSWER,1);
        result = db.insert(Table_Name, null, c);
        //Question Number 25
        c.put(Constants.QUESTION,"what is the traversal order of the following code?\n" +
                "void function(struct node * root){\n" +
                "\tif(root == NULL)\n" +
                "\t    return;\n" +
                "\tfunction(root->left);\n" +
                "\tfunction(root->right);\n" +
                "\tprintf(\"%d\",root->data);\n" +
                "}");
        c.put(Constants.ANSWER1, "preorder");
        c.put(Constants.ANSWER2, "postorder");
        c.put(Constants.ANSWER3, "levelorder");
        c.put(Constants.ANSWER4, "inorder");
        c.put(Constants.CORRECT_ANSWER,2);
        result = db.insert(Table_Name, null, c);
    }

    public Cursor getData(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from  Records where _id = " + id, null);
        return res;
    }

    public Cursor getData(int[] questions) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from  Records where _id in (" + questions[0] + " , " + questions[1] +
                " , " + questions[2] + " , " + questions[3] + " , " + questions[4] + " )", null);
        return res;
    }

}
