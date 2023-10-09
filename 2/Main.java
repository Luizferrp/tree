import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int a20000[] = new int[20000];
    for (int i=0; i<20000; i++){
      a20000[i]=rand.nextInt(200000);
    }
    AVLTree tree = new AVLTree();
    
    System.out.println("iniciando testes de inserçao com 100 elementos:");
    long startTime = System.nanoTime();                
    for (int i=0; i<100; i++){
      tree.add(a20000[i]);
    }
    long endTime = System.nanoTime();
    System.out.println( (endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de busca com 100 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<100; i++){
      tree.silentSearch(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de remoção com 100 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<100; i++){
      tree.remove(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;

    System.out.println("iniciando testes de inserçao com 500 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<500; i++){
      tree.add(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println( (endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de busca com 500 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<500; i++){
      tree.silentSearch(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de remoção com 500 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<500; i++){
      tree.remove(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;

    System.out.println("iniciando testes de inserçao com 1000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<1000; i++){
      tree.add(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println( (endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de busca com 1000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<1000; i++){
      tree.silentSearch(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de remoção com 1000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<1000; i++){
      tree.remove(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;

    System.out.println("iniciando testes de inserçao com 10000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<10000; i++){
      tree.add(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println( (endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de busca com 10000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<10000; i++){
      tree.silentSearch(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de remoção com 10000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<10000; i++){
      tree.remove(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;

    System.out.println("iniciando testes de inserçao com 20000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<20000; i++){
      tree.add(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println( (endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de busca com 20000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<20000; i++){
      tree.silentSearch(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
    System.out.println("iniciando testes de remoção com 20000 elementos:");
    startTime = System.nanoTime();                
    for (int i=0; i<20000; i++){
      tree.remove(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;

    
        /*
    AVLTree tree = new AVLTree();
    tree.add(10);
    tree.add(20);
    tree.add(30);
    tree.add(40);
    tree.add(50);
    tree.add(25);
    tree.show();
    System.out.println("Search for 30:");
    tree.search(30);
    System.out.println("Delete 30:");
    tree.deleteNode(tree.root, 30);
    tree.show();
    */
  }
}
class Node {
  private int key, height;
  private Node left, right;

  Node(int d) {
    key = d;
    height = 1;
  }
  
  public Node left() {
    return this.left;
  }
  public Node right() {
    return this.right;
  }
  public int key() {
    return this.key;
  }
  public int height() {
    return this.height;
  }
  public void left(Node left) {
    this.left = left;
  }
  public void right(Node right) {
    this.right = right;
  }
  public void key(int valor) {
    this.key = valor;
  }
  public void height(int height) {
    this.height = height;
  }
}

class AVLTree {

  Node root;

  public int height(Node N) {
    if (N == null)
      return 0;
    return N.height();
  }

  public int max(int a, int b) {
    return (a > b) ? a : b;
  }

  public Node rightRotate(Node y) {
    Node x = y.left();
    Node T = x.right();
    x.right(y);
    y.left(T);
    y.height(max(height(y.left()), height(y.right())) + 1);
    x.height(max(height(x.left()), height(x.right())) + 1);
    return x;
  }

  public Node leftRotate(Node x) {
    Node y = x.right();
    Node T = y.left();
    y.left(x);
    x.right(T);
    x.height(max(height(x.left()), height(x.right())) + 1);
    y.height(max(height(y.left()), height(y.right())) + 1);
    return y;
  }

  public int getBalance(Node N) {
    if (N == null)
      return 0;
    return height(N.left()) - height(N.right());
  }

  public void add(int value){
    this.root = insert(this.root, value);
  }

  private Node insert(Node node, int key) {
    if (node == null)
      return (new Node(key));
    if (key < node.key())
      node.left(insert(node.left(), key));
    else if (key > node.key())
      node.right(insert(node.right(), key));
    else
      return node;
    node.height(1 + max(height(node.left()), height(node.right())));
    int balance = getBalance(node);
    if (balance > 1 && key < node.left().key())
      return rightRotate(node);
    if (balance < -1 && key > node.right().key())
      return leftRotate(node);
    if (balance > 1 && key > node.left().key()) {
      node.left(leftRotate(node.left()));
      return rightRotate(node);
    }

    if (balance < -1 && key < node.right().key()) {
      node.right(rightRotate(node.right()));
      return leftRotate(node);
    }
    return node;
  }

  public Node minValueNode(Node node) {
    Node current = node;
    while (current.left() != null)
      current = current.left();
    return current;
  }
  
  public void remove(int key){
    this.root = deleteNode(this.root, key);
  }
  public Node deleteNode(Node root, int key) {
    if (root == null)
      return root;
    if (key < root.key())
      root.left(deleteNode(root.left(), key));
    else if (key > root.key())
      root.right(deleteNode(root.right(), key));
    else {
      if ((root.left() == null) || (root.right() == null)) {
        Node temp = null;
        if (temp == root.left())
          temp = root.right();
        else
          temp = root.left();
        if (temp == null) {
          temp = root;
          root = null;
        } else
          root = temp;
      } else {
        Node temp = minValueNode(root.right());
        root.key(temp.key());
        root.right(deleteNode(root.right(), temp.key()));
      }
    }
    if (root == null)
      return root;
    root.height(max(height(root.left()), height(root.right())) + 1);
    int balance = getBalance(root);
    if (balance > 1 && getBalance(root.left()) >= 0)
      return rightRotate(root);
    if (balance > 1 && getBalance(root.left()) < 0) {
      root.left(leftRotate(root.left()));
      return rightRotate(root);
    }
    if (balance < -1 && getBalance(root.right()) <= 0)
      return leftRotate(root);
    if (balance < -1 && getBalance(root.right()) > 0) {
      root.right(rightRotate(root.right()));
      return leftRotate(root);
    }
    return root;
  }
  public void show(){
    show(this.root);
    System.out.println("");
  }
  public void show(Node node) {
    if (node != null) {
      System.out.print(node.key() + " ");
      show(node.left());
      show(node.right());
    }
  }

  public void silentSearch(int key){
    Node result = search(this.root, key);
  }

  public void search(int key){
    Node result = search(this.root, key);
    if (result != null) {
      System.out.println("Found: " + result.key());
    } else {
      System.out.println("Not Found");
    }
  }

  public Node search(Node root, int key) {
    if (root == null || root.key() == key)
      return root;
    if (root.key() > key)
      return search(root.left(), key);
    return search(root.right(), key);
  }

}

