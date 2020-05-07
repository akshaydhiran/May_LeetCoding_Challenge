package May_LeetCoding_Challenge.Day7_CousinsInBinaryTree;

java.util.*;
class Solution {
    void iot(TreeNode root,int[] arr,int x,int y, int l ){
                     if(root==null || arr[2]==1 )return;
                     
                     if(root.val==x){
                         arr[0]=l;
                     }
                     if(root.val==y){
                         arr[1]=l;
                     }
                
                     if(root.left!=null && root.right!=null){
             if( (root.left.val==x && root.right.val==y) || (root.right.val==x &&root.left.val==y) ){
                             arr[2]=1;
                         }
                     }
                     iot(root.left,arr,x,y,l+1);
                     iot(root.right,arr,x,y,l+1);
            }
     public boolean isCousins(TreeNode root, int x, int y) {
                    if(root==null)return false;
                    int[] arr=new int[3];
                    arr[0]=0;arr[1]=0;arr[2]=0;    
                    iot(root,arr,x,y,0);
                    if(arr[2]==1)return false;// Brothers
                    if(arr[0]!=arr[1])return false;// Not from same generation
         
                    return true;
                    
                  
     }
 }