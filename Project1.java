import java.util.*;

interface Alphabets{
void A();
void B();
void C();
void D();
void E();
void F();
void G();
void H();
void I();
void J();
void K();
void L();
void M();
void N();
void O();
void P();
void Q();
void R();
void S();
void T();
void U();
void V();
void W();
void X();
void Y();
void Z();
}

class Characters{
    public void A(int n, String character){
        for (int i = 0; i<n; i++){
            for(int j = 0; j < n; j++){
                if ( i ==0 && j > 0 && j < (n-1) || j == 0 && i > 0 || j == (n-1) && i > 0 || i == (n-1)/2 && j <= (n-1)){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
        }
        System.out.println("");
    }
    }
    public void B(int n, String character){
        for (int i = 0; i<n; i++){
            for(int j = 0; j < n; j++){
                if ( j == 0 || i == 0 && j < (n-1) || j == ( n-1) && i > 0 && i < ( n-1)/2 || j == (n-1) && i > ( n-1)/2 && i < ( n-1) || i == (n-1)/2  && j < (n-1) || i == (n-1) && j < (n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void C(int n, String character ){
        for (int i = 0; i<n; i++){
            for ( int j = 0; j < n; j++){
                if ( i == 0 && j <= ( n-1) && j > 0 || j ==0 && i > 0 && i < n-1 || i == n-1 && j > 0 && j <= (n-1)){
                    System.out.print(character);
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void D(int n, String character){
        for (int i = 0; i<n; i++){
            for ( int j = 0; j < n; j++){
                if (i == 0 && j < ( n-1) || j == 0 || i == n-1 && j < ( n-1) || j == ( n-1) && i > 0 && i < n-1){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void E(int n, String character){
        for (int i = 0; i<n; i++){
            for ( int j = 0; j < n; j++){
                if ( i ==0 && j <= ( n-1) || j == 0|| i == ( n-1)&& j <= ( n-1)  || i == ( n-1)/2 && j <= ( n-1)){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void F(int n, String character){
        for (int i = 0; i<n; i++){
            for ( int j = 0; j < n; j++){
                if ( i ==0 && j <= ( n-1) || j == 0|| i == ( n-1)/2 && j <= ( n-1))	{
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }	
                }
                System.out.println();
        }
    }
    public void G(int n, String character){
        for( int i = 0; i<n; i++){
            for ( int j = 0; j< n; j++) {
                if (i == 0 && j > 0 && j <= ( n-1)/2 || j == 0 && i > 0 && i < (n-1) ||i == (n-1) && j > 0 && j < ( n-1)/2 || j == ( n-1)/2  && i >= ( n-1)/2 &&i < ( n-1) || i == ( n-1)/2 && j >= ( n-1)/2 || j == ( n-1) && i >= (n-1)/2    ){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(""); 
        }
    }
    public void H(int n, String character){
        for(int i = 0; i<n; i++){
            for (int j = 0; j< n; j++){
                if (j == 0 || j == ( n-1) || i == ( n-1)/2){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void I(int n, String character){
        for(int i =0; i<n; i++){
            for ( int j = 0 ; j < n; j++){
                if ( i == 0|| j == ( n-1)/2 || i == ( n-1)){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void J(int n, String character){
        for(int i = 0; i < n; i++){
            for ( int j = 0; j < n ; j++) {
                if ( i == 0 || j == ( n-1) && i < (n-1) || i == (n-1) && j < ( n-1) && j > 0 || j == 0 && i >= 2*( n-1)/3 && i < ( n-1)){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void K(int n, String character){
        for(int i = 0; i< n; i++){
            for ( int j = 0; j < n; j++){
                if ( j == 0 || i + j == ( n-1)/2 || i - j == ( n-1)/2){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void L(int n, String character){
        for(int i = 0; i< n; i++){
            for ( int j = 0; j< n; j++){
                if (j == 0 || i == ( n-1)){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void M(int n, String character){
        for(int i = 0; i< n; i++){
            for ( int j = 0; j < n; j++){
                if ( j == 0|| j == (n-1) || i == j && i <= ( n-1)/2|| i+ j == (n-1) && i <= ( n-1)/2 ){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void N(int n, String character){
        for(int i = 0; i< n; i++){
            for ( int j = 0; j<n; j++){
                if ( j == 0|| j == (n-1) || i == j  ){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void O(int n, String character){
        for(int i = 0; i< n; i++){
            for ( int j = 0 ; j< n; j++){
                if (i == 0 && j > 0 && j <( n-1) || j == 0 && i > 0 && i < (n-1) || i == (n-1) && j > 0 && j < (n-1) || j == (n-1) &&i > 0 && i <(n-1)){
                System.out.print(character);
            }
            else{
                System.out.print(" ");
            }
        
            }
            System.out.println("");
        }
    }
    public void P(int n, String character){
        for(int i = 0; i< n; i++){
            for ( int j = 0; j< n; j++){
                if (j == 0|| i == 0 && j < ( n-1 ) || i == (n-1)/2 && j < ( n-1 )||j ==(n-1) && i >0 && i <(n-1)/2){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void Q(int n, String character){
        for(int i = 0; i< n; i++){
            for ( int j = 0; j< n; j++){
                if (i == 0 && j < ( n-1 ) && j > 0||i == 2*(n-1)/3 && j > 0 && j < (n-1) || j == 0 &&  i >0 && i < 2*(n-1)/3 || j == (n-1)&&  i >0 && i < 2*(n-1)/3||i == j && j >(n-1)/2 &&i >(n-1)/2 ){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void R(int n, String character){
        for(int i = 0; i< n; i++){
            for (int j = 0; j<n; j++){
                if ( j == 0|| i == 0 && j < ( n-1 ) || i == (n-1)/2 && j < ( n-1 )||j ==(n-1) && i >0 && i <(n-1)/2 ||i == j && j >(n-1)/2 &&i >(n-1)/2 ){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void S(int n, String character){
        for(int i = 0; i < n; i++){
            for ( int j = 0 ; j < n ; j++){
                if ( j == (n-1) && i > 0 && i <=(n-1)/4 || i == 0 && j > 0 && j < (n-1) || j == 0 && i > 0 && i < (n-1)/2 || i == (n-1)/2 && j> 0 && j < (n-1) || j == (n-1) && i > (n-1)/2 && i < (n-1) || i == (n-1) && j > 0 && j < (n-1) || j == 0 && i > 3* (n-1)/4 && i < (n-1)){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void T(int n, String character){
        for(int i = 0; i < n; i++){
            for ( int j = 0 ; j < n; j++){
                if ( i == 0|| j == ( n-1)/2 ){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void U(int n, String character){
        for(int i = 0; i < n; i++){
            for (int j = 0; j<n ; j++){
                if (j == 0 && i <(n-1)|| j == (n-1)&& i < (n-1)||  i == (n-1) &&j > 0 && j <(n-1)){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void V(int n , String character){
        int i, j;
        for (i = n - 1; i >= 0; i--) 
        {
            // outer gap loop
            for (j = n - 1; j > i; j--) 
            {
                System.out.print(" ");
            }
  
            // 65 is ASCII of 'A'
            System.out.print((character));
  
            // inner gap loop
            for (j = 1; j < (i * 2); j++)
                System.out.print(" ");
  
            if (i >= 1)
                System.out.print((character));
            System.out.print("\n");
        }
        
    }
    public void W(int n, String character){
        for(int i = 0; i<n ; i++){
            for (int j = 0; j < n; j++){
                if ( j == 0 || j == (n-1) || i + j== (n-1) && i > (n-1)/2 || i == j && i > (n-1)/2){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void X(int n, String character){
        for(int i = 0; i< n; i++){
            for(int j = 0 ; j < n; j++){
                if ( i== j || i + j == ( n-1)){
                    System.out.print(character);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void Y(int n, String character){
        for(int i = 0; i<n; i++){
            for ( int j = 0; j< n; j++){
                if ( i == j && i <= (n-1)/2 || i+j == (n-1) && i <= (n-1)/2 || j == (n-1)/2 && i > (n-1)/2){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void Z(int n, String character){
        for(int i = 0 ; i< n; i++){
            for ( int j = 0 ; j<n; j++){
                if (i == 0|| i ==(n-1)|| i+j == (n-1)){
                    System.out.print(character);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

class Name extends Characters {
    public void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name.");
        String name = sc.nextLine();
        name = name.toUpperCase();
        System.out.println("Enter the character in which you want to print your name.");
        String  character = sc.next();
        System.out.println("Enter the font size.");
        int n = sc.nextInt();
        char[] ch = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            ch[i] = name.charAt(i);
        }

        for( int k = 0; k< ch.length; k++){
            if (ch[k] == 'A'){
                A(n, character);
            }
            else if (ch[k] == 'B'){
                B(n, character);
            }
            else if ( ch[k] == 'C'){
                C(n, character);
            }
            else if ( ch[k] == 'D'){
                D(n, character);
            }
            else if ( ch[k] == 'E'){
                E(n, character);
            }
            else if (ch[k] == 'F'){
                F(n, character);
            }
            else if (ch[k] == 'G'){
                G(n, character);
            }
            else if (ch[k] == 'H'){
                H(n, character);
            }
            else if (ch[k] == 'I'){
                I(n, character);
            }
            else if(ch[k] == 'J'){
                J(n, character);
            }
            else if (ch[k] == 'K'){
                K(n, character);
            }
            else if(ch[k] == 'L'){
                L(n, character);
            }
            else if(ch[k] == 'M'){
                M(n, character);
            }
            else if(ch[k] == 'N'){
                N(n, character);
            }
            else if(ch[k] == 'O'){
                O(n, character);
            }
            else if(ch[k] == 'P'){
                P(n, character);
            }
            else if(ch[k] == 'Q'){
                Q(n, character);
            }
            else if(ch[k] == 'R'){
                R(n, character);
            }
            else if(ch[k] == 'S'){
                S(n, character);
            }
            else if(ch[k] == 'T'){
                T(n, character);
            }
            else if(ch[k] == 'U'){
                U(n, character);
            }
            else if(ch[k] == 'V'){
                V(n, character);
            }
            else if(ch[k] == 'W'){
                W(n, character);
            }
            else if(ch[k] == 'X'){
                X(n, character);
            }
            else if(ch[k] == 'Y'){
                Y(n, character);
            }
            else if(ch[k] == 'Z'){
                Z(n, character);
            }
            
        }
    }
}

class Project1{
    public static void main(String args[]){
        Name n = new Name();
        n.name();
    }
}