namespace Assignment1
{
    class NotificationEventArgs
    {
        public string Message { get; }

        public NotificationEventArgs(string message)
        {
            Message = message;
        }
    }
}
