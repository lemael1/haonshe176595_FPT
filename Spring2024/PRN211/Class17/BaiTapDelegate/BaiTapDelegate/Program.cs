namespace BaiTapDelegate
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Tạo một đối tượng Buyer với 100 đơn vị tiền trong ví
            Buyer buyer = new Buyer(100);

            // Thử thanh toán 50 đơn vị tiền
            Console.WriteLine(buyer.Pay(50));  // Kết quả: "Pay successfully"

            // Thử thanh toán 60 đơn vị tiền
            Console.WriteLine(buyer.Pay(60));  // Kết quả: "You don't have any money"
        }
    }
}
