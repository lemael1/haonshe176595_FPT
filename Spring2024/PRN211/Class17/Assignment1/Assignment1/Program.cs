namespace Baitap
{
    internal class Program
    {
        static void Main(string[] args)
        {
            StoreManager storeManager = new StoreManager();         
            storeManager.InitData();
            storeManager.menu();

        }
    }
}
