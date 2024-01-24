namespace WinFormsApp2
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            txtName = new TextBox();
            label1 = new Label();
            button1 = new Button();
            label2 = new Label();
            lstName = new ListBox();
            SuspendLayout();
            // 
            // txtName
            // 
            txtName.Location = new Point(606, 143);
            txtName.Name = "txtName";
            txtName.Size = new Size(125, 27);
            txtName.TabIndex = 0;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(606, 105);
            label1.Name = "label1";
            label1.Size = new Size(87, 20);
            label1.TabIndex = 1;
            label1.Text = "Enter Name";
            // 
            // button1
            // 
            button1.Location = new Point(618, 274);
            button1.Name = "button1";
            button1.Size = new Size(94, 29);
            button1.TabIndex = 2;
            button1.Text = "AddName";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(145, 105);
            label2.Name = "label2";
            label2.Size = new Size(93, 20);
            label2.TabIndex = 3;
            label2.Text = "List of Name";
            // 
            // lstName
            // 
            lstName.FormattingEnabled = true;
            lstName.ItemHeight = 20;
            lstName.Location = new Point(145, 143);
            lstName.Name = "lstName";
            lstName.Size = new Size(150, 104);
            lstName.TabIndex = 4;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(lstName);
            Controls.Add(label2);
            Controls.Add(button1);
            Controls.Add(label1);
            Controls.Add(txtName);
            Name = "Form1";
            Text = "btnAdd";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox txtName;
        private Label label1;
        private Button button1;
        private Label label2;
        private ListBox lstName;
    }
}