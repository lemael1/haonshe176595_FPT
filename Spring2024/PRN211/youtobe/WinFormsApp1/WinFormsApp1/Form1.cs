
namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        Button newButton;
        public Form1()
        {

            InitializeComponent();
            CreateNewButton();
        }

        private void CreateNewButton()
        {
            newButton = new Button();
            newButton.Name = "btNewButton";
            newButton.Text = "NewButton";
            newButton.Size = new Size(btClickMe.Size.Width, btClickMe.Size.Height);
            newButton.Location = new Point(btClickMe.Location.X, btClickMe.Location.Y
                + btClickMe.Size.Height + 30);
            newButton.Click += btNewButton_Click;
            this.Controls.Add(newButton);
        }

        private void btClickMe_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Hello em iuu");
        }
        private void btNewButton_Click(object sender, EventArgs e)
        {
            Button b= (Button)sender;
            MessageBox.Show("hello" + b.Text);
        }
    }
}
