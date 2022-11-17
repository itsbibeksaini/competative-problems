class BinaryTreeExample {
    fun addNode(treeNode: TreeNode?, value: Int): TreeNode{

        var node = treeNode
        if(node == null)
            node = TreeNode(value)
        else{
            if(value > node.value){
                if(node.right == null)
                    node.right = TreeNode(value)
                else
                    addNode(node.right!!, value)
            }
            else{
                if(node.left == null)
                    node.left = TreeNode(value)
                else
                    addNode(node.left!!,  value)
            }
        }

        return node
    }
}

