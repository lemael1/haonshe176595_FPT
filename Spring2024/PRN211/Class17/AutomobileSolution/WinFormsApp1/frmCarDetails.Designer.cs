namespace AutomobileWinApp
{
    partial class frmCarDetails
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
            IbCarID = new Label();
            IbCarName = new Label();
            IbManufacturer = new Label();
            IbPrice = new Label();
            IbReleaseYear = new Label();
            txtCarID = new TextBox();
            txtCarName = new TextBox();
            cboManufacturer = new ComboBox();
            txtPrice = new MaskedTextBox();
            txtReleaseYear = new MaskedTextBox();
            btnSave = new Button();
            btnCancel = new Button();
            SuspendLayout();
            // 
            // IbCarID
            // 
            IbCarID.AutoSize = true;
            IbCarID.Location = new Point(43, 89);
            IbCarID.Name = "IbCarID";
            IbCarID.Size = new Size(50, 20);
            IbCarID.TabIndex = 0;
            IbCarID.Text = "Car ID";
            // 
            // IbCarName
            // 
            IbCarName.AutoSize = true;
            IbCarName.Location = new Point(43, 130);
            IbCarName.Name = "IbCarName";
            IbCarName.Size = new Size(75, 20);
            IbCarName.TabIndex = 1;
            IbCarName.Text = "Car Name";
            // 
            // IbManufacturer
            // 
            IbManufacturer.AutoSize = true;
            IbManufacturer.Location = new Point(43, 173);
            IbManufacturer.Name = "IbManufacturer";
            IbManufacturer.Size = new Size(97, 20);
            IbManufacturer.TabIndex = 2;
            IbManufacturer.Text = "Manufacturer";
            // 
            // IbPrice
            // 
            IbPrice.AutoSize = true;
            IbPrice.Location = new Point(43, 214);
            IbPrice.Name = "IbPrice";
            IbPrice.Size = new Size(41, 20);
            IbPrice.TabIndex = 3;
            IbPrice.Text = "Price";
            // 
            // IbReleaseYear
            // 
            IbReleaseYear.AutoSize = true;
            IbReleaseYear.Location = new Point(43, 255);
            IbReleaseYear.Name = "IbReleaseYear";
            IbReleaseYear.Size = new Size(88, 20);
            IbReleaseYear.TabIndex = 4;
            IbReleaseYear.Text = "ReleaseYear";
            // 
            // txtCarID
            // 
            txtCarID.Location = new Point(141, 82);
            txtCarID.Name = "txtCarID";
            txtCarID.Size = new Size(256, 27);
            txtCarID.TabIndex = 5;
            // 
            // txtCarName
            // 
            txtCarName.Location = new Point(141, 123);
            txtCarName.Name = "txtCarName";
            txtCarName.Size = new Size(256, 27);
            txtCarName.TabIndex = 6;
            // 
            // cboManufacturer
            // 
            cboManufacturer.FormattingEnabled = true;
            cboManufacturer.Items.AddRange(new object[] { "Audi", "BMW", "Ford", "Honda", "Huyndai", "Kia", "Suzuki", "Toyota" });
            cboManufacturer.Location = new Point(141, 165);
            cboManufacturer.Name = "cboManufacturer";
            cboManufacturer.Size = new Size(256, 28);
            cboManufacturer.TabIndex = 7;
            // 
            // txtPrice
            // 
            txtPrice.Location = new Point(141, 214);
            txtPrice.Mask = "000000000";
            txtPrice.Name = "txtPrice";
            txtPrice.Size = new Size(256, 27);
            txtPrice.TabIndex = 8;
            txtPrice.Text = "0";
            // 
            // txtReleaseYear
            // 
            txtReleaseYear.Location = new Point(141, 252);
            txtReleaseYear.Mask = "0000";
            txtReleaseYear.Name = "txtReleaseYear";
            txtReleaseYear.Size = new Size(256, 27);
            txtReleaseYear.TabIndex = 9;
            txtReleaseYear.Text = "0";
            // 
            // btnSave
            // 
            btnSave.DialogResult = DialogResult.OK;
            btnSave.Location = new Point(82, 304);
            btnSave.Name = "btnSave";
            btnSave.Size = new Size(124, 29);
            btnSave.TabIndex = 10;
            btnSave.Text = "Save";
            btnSave.UseVisualStyleBackColor = true;
            btnSave.Click += btnSave_Click;
            // 
            // btnCancel
            // 
            btnCancel.DialogResult = DialogResult.Cancel;
            btnCancel.Location = new Point(269, 304);
            btnCancel.Name = "btnCancel";
            btnCancel.Size = new Size(117, 29);
            btnCancel.TabIndex = 11;
            btnCancel.Text = "Cancel";
            btnCancel.UseVisualStyleBackColor = true;
            btnCancel.Click += btnCancel_Click;
            // 
            // frmCarDetails
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(btnCancel);
            Controls.Add(btnSave);
            Controls.Add(txtReleaseYear);
            Controls.Add(txtPrice);
            Controls.Add(cboManufacturer);
            Controls.Add(txtCarName);
            Controls.Add(txtCarID);
            Controls.Add(IbReleaseYear);
            Controls.Add(IbPrice);
            Controls.Add(IbManufacturer);
            Controls.Add(IbCarName);
            Controls.Add(IbCarID);
            Name = "frmCarDetails";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "frmCarDetails";
            Load += frmCarDetails_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label IbCarID;
        private Label IbCarName;
        private Label IbManufacturer;
        private Label IbPrice;
        private Label IbReleaseYear;
        private TextBox txtCarID;
        private TextBox txtCarName;
        private ComboBox cboManufacturer;
        private MaskedTextBox txtPrice;
        private MaskedTextBox txtReleaseYear;
        private Button btnSave;
        private Button btnCancel;
    }
}