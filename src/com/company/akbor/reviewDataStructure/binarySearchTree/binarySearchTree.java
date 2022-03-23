package com.company.akbor.reviewDataStructure.binarySearchTree;
import java.util.LinkedList;
public class binarySearchTree {
       public class Node{
           private int value;
           private Node right;
           private Node left;
           Node(int value){
                  this.value = value;
           }
       }
       public Node insert(Node root, int value){
              if (root == null){
                     Node newNode = new Node(value);
                     root = newNode;
              }else if(root.value>=value){
                     root.left = insert(root.left, value);
              }else{
                  root.right = insert(root.right, value);
              }
              return root;
       }
       public void inOrder(Node root){
           if (root!=null){
               inOrder(root.left);
               System.out.print(root.value+ "->");
               inOrder(root.right);
           }
       }
        public void preOrder(Node root){
            if (root!=null){
                System.out.print(root.value+ "->");
                preOrder(root.left);
                preOrder(root.right);
            }
        }
        public void postOrder(Node root){
            if (root!=null){
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.value+ "->");
            }
        }



        //Depth First or Postorder : Stack
        public void DFS(Node root){
            LinkedList<Node>Stack = new LinkedList();
            LinkedList<Integer> output = new LinkedList<>();

            if (root!=null) Stack.add(root);
            else System.out.println("EMPTY TREE");

            while(!Stack.isEmpty()){
                Node curr = Stack.pollLast();
                output.addFirst(curr.value);

                if (curr.left != null){
                    Stack.add(curr.left);
                }
                if (curr.right!=null){
                    Stack.add(curr.right);
                }
            }
            System.out.println(output);
        }
        //Breadth First : Queue
        public void BFS(Node root){
            LinkedList<Node> Queue = new LinkedList<>();
            LinkedList<Integer>output = new LinkedList<>();

            if (root!=null) Queue.add(root);
            else System.out.println("EMPTY TREE");

            while (!Queue.isEmpty()){
                Node curr = Queue.pollFirst();
                output.add(curr.value);

                if (curr.left != null){
                    Queue.add(curr.left);
                }
                if (curr.right!=null){
                    Queue.add(curr.right);
                }
            }
            System.out.println(output);

        }

        public int maxHeight(Node root){
           if (root!=null){
               int leftHeight = maxHeight(root.left);
               int rightHeight = maxHeight(root.right);
               return 1+(Math.max(leftHeight, rightHeight));
           }
          return 0;
        }

        public int diameter(Node root){
            if (root!=null){
                int leftHeight = maxHeight(root.left);
                int rightHeight = maxHeight(root.right);

                int leftDiameter = diameter(root.left);
                int rightDiameter = diameter(root.right);

                return (Math.max((1+(Math.max(leftHeight,rightHeight))), Math.max(rightDiameter,leftDiameter)));
            }
            return 0;
        }
}
