fun main(){
    val binaryTree = BinaryTreeExample()
    var rootNode:TreeNode? = null
    intArrayOf(2,5,3,25,6,4,28,10).forEach { value ->
        rootNode = binaryTree.addNode(rootNode, value)
    }
}