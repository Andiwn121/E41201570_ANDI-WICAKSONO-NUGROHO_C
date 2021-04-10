
package BinaryTree;

import java.util.Stack;

public class Tree {
    private Node root;
    
    public Tree(){
        root = null;
    }
    
    public Node find(int key) { Node current = root;
        while (current.id != key) {
            if (key < current.id){
                current = current.leftchild;
            } else {
                current = current.rightchild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
    
    public void insert (int id, String data){
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root; Node parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.leftchild;
                    if (current == null) {
                        parent.leftchild = newNode; 
                        return;
                    }
                } else {
                    current = current.rightchild;
                    if (current == null) {
                        parent.rightchild = newNode; 
                        return;
                    }
                }
            }
        }
    }
    
    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        
        while (current.id != key){
            parent = current;
            if (key < current.id){
                isLeftChild = true;
                current = current.leftchild;
            } else {
                isLeftChild = false;
                current = current.rightchild;
            }
            if (current == null){
                return false;
            }
        }
        if (current.leftchild == null && current.rightchild == null){
            if (current == root){
                root = null;
            } else if (isLeftChild){
                parent.leftchild = current.leftchild;
            } else {
                parent.rightchild = current.leftchild;
            }
        } else if (current.rightchild == null){
            if (current == root){
                root = current.leftchild;
                
            } else if (isLeftChild){
                parent.leftchild = current.leftchild;
            } else {
                parent.rightchild = current.leftchild;
            }
        } else if (current.leftchild == null){
            if (current == root){
                root = current.rightchild;
            } else if (isLeftChild){
                parent.leftchild = current.rightchild;
            } else {
                parent.rightchild = current.rightchild;
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root){
                root = successor;
            } else if (isLeftChild){
                parent.leftchild = successor;
            } else {
                parent.rightchild = successor;
            }
            successor.leftchild = current.leftchild;
        }
        return true;
    }
    
    private Node getSuccessor(Node delNode) {
       Node successorParent = delNode;
       Node successor = delNode;
       Node current = delNode.rightchild;
       while (current != null){
           successorParent = successor;
           successor = current;
           current = current.leftchild;
       }
       if (successor != delNode.rightchild){
           successorParent.leftchild = successorParent.rightchild;
           successor.rightchild = delNode.rightchild;
       }
       return successor;
    }
    
    public void traverse(int traverseType){
        switch (traverseType){
            case 1:
                System.out.print("Preorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("Inorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("Postorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }
    
    private void preOrder(Node localRoot){
        if (localRoot != null){
            System.out.print(localRoot.id+" ");
            preOrder(localRoot.leftchild);
            preOrder(localRoot.rightchild);
        }
    }
    
    private void inOrder(Node localRoot){
        if (localRoot != null){
            inOrder(localRoot.leftchild);
            System.out.print(localRoot.id+" ");
            inOrder(localRoot.rightchild);
        }
    }
    
    private void postOrder(Node localRoot){
        if (localRoot != null){
            postOrder(localRoot.leftchild);
            postOrder(localRoot.rightchild);
            System.out.print(localRoot.id+" ");
        }
    }
    
    public void displayTree(){
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false; System.out.println(
        "......................................................."
        );
        while (isRowEmpty == false){
            Stack localStack = new Stack();
            isRowEmpty =true;
            for(int j=0; j<nBlanks; j++){
                System.out.print(' ');
            }
            while (globalStack.isEmpty() == false){
                Node temp = (Node) globalStack.pop();
                if (temp != null){
                    System.out.print(temp.id);
                    localStack.push(temp.leftchild);
                    localStack.push(temp.rightchild);
                    if (temp.leftchild != null || temp.rightchild != null){
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");localStack.push(null);localStack.push(null);
                }
                for (int j = 0; j < nBlanks *2-2; j++){
                    System.out.print(' ');
                }
            }
            System.out.println();
            
            nBlanks /=2;
            while (localStack.isEmpty() == false){
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(
        "...................................................");
    }
    
}


