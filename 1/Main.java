import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int a20000[] = new int[20000];
    for (int i=0; i<20000; i++){
      a20000[i]=rand.nextInt(200000);
    }
    Tree tree = new Tree();
    
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
      tree.remover(a20000[i]);
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
      tree.remover(a20000[i]);
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
      tree.remover(a20000[i]);
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
      tree.remover(a20000[i]);
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
      tree.remover(a20000[i]);
    }
    endTime = System.nanoTime();
    System.out.println((endTime - startTime) / 1000000.0 + " milissegundos");
    endTime = startTime = 0;
  }
}

class Node {
  private int valor;
  private Node left, right;

  public Node(int valor) {
    this.valor = valor;
    this.left = null;
    this.right = null;
  }
  public Node left() {
    return this.left;
  }
  public Node right() {
    return this.right;
  }
  public int valor() {
    return this.valor;
  }
  public void left(Node left) {
    this.left = left;
  }
  public void right(Node right) {
    this.right = right;
  }
  public void valor(int valor) {
    this.valor = valor;
  }
}

public class Tree {
  private Node root;

  public Tree() {
    this.root = null;
  }

  public void add(int valor) {
    root = add(this.root, valor);
  }

  private Node add(Node root, int valor) {
    if (root == null) {
      this.root = new Node(valor);
      return this.root;
    }
    if (valor < root.valor())
      root.left(add(root.left(), valor));
    else if (valor > root.valor())
      root.right(add(root.right(), valor));
    return root;
  }

  public void find(int valor) {
    Node encontrado = find(this.root, valor);
    if (encontrado != null)
      System.out.println(valor + " encontrado");
    else
      System.out.println(valor + " não encontrado");
  }
  
  public void silentSearch(int valor){
    find(this.root, valor);
  }
  private Node find(Node root, int valor) {
    if (root == null || root.valor() == valor)
      return root;
    if (valor > root.valor())
      return find(root.right(), valor);
    return find(root.left(), valor);
  }

  private Node smaller(Node root) {
    Node atual = root;
    while (atual.left() != null)
      atual = atual.left();
    return atual;
  }

  public void remover(int valor) {
    root = remover(root, valor);
  }

  private Node remover(Node root, int valor) {
    if (root == null)
      return root;
    if (valor < root.valor())
      root.left(remover(root.left(), valor));
    else if (valor > root.valor())
      root.right(remover(root.right(), valor));
    else {
      if (root.left() == null)
        return root.right();
      else if (root.right() == null)
        return root.left();
      root.valor(smaller(root.right()).valor());
      root.right(remover(root.right(), root.valor()));
    }
    return root;
  }

  public void show(){
    show(this.root);
    System.out.println("");
  }

  public void show(Node node) {
    if (node != null) {
      show(node.left());
      System.out.print(node.valor() + " ");
      show(node.right());
    }
  }
}

