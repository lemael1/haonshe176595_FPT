using Assignment1;

namespace Baitap
{
    internal class Program
    {
        static void Main(string[] args)
        {
            StoreManager storeManager = new StoreManager();

            // Subscribe to the NotificationEvent
            storeManager.NotificationEvent += HandleNotification;

            // Initialize data
            storeManager.InitData();

            // Run the menu
            storeManager.menu();
        }

         static void HandleNotification(object sender, NotificationEventArgs e)
        {
            Console.WriteLine($"Notification: {e.Message}");
            Console.ResetColor();
        }
    }
}
