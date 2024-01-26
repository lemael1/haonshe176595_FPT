namespace AutomobileWinApp
{
    partial class frmCarManagement
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
            label5 = new Label();
            IbCarName = new Label();
            IbReleaseYear = new Label();
            IbPrice = new Label();
            IbManufacturer = new Label();
            txtCarName = new TextBox();
            txtCarID = new TextBox();
            txtManufacturer = new TextBox();
            txtReleaseYear = new TextBox();
            txtPrice = new TextBox();
            btnLoad = new Button();
            btnNew = new Button();
            btnDelete = new Button();
            dgvCarList = new DataGridView();
            ((System.ComponentModel.ISupportInitialize)dgvCarList).BeginInit();
            SuspendLayout();
            // 
            // IbCarID
            // 
            IbCarID.AutoSize = true;
            IbCarID.Location = new Point(93, 59);
            IbCarID.Name = "IbCarID";
            IbCarID.Size = new Size(0, 20);
            IbCarID.TabIndex = 1;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(53, 24);
            label5.Name = "label5";
            label5.Size = new Size(50, 20);
            label5.TabIndex = 6;
            label5.Text = "Car ID";
            // 
            // IbCarName
            // 
            IbCarName.AutoSize = true;
            IbCarName.Location = new Point(53, 59);
            IbCarName.Name = "IbCarName";
            IbCarName.Size = new Size(75, 20);
            IbCarName.TabIndex = 7;
            IbCarName.Text = "Car Name";
            // 
            // IbReleaseYear
            // 
            IbReleaseYear.AutoSize = true;
            IbReleaseYear.Location = new Point(394, 66);
            IbReleaseYear.Name = "IbReleaseYear";
            IbReleaseYear.Size = new Size(88, 20);
            IbReleaseYear.TabIndex = 10;
            IbReleaseYear.Text = "ReleaseYear";
            // 
            // IbPrice
            // 
            IbPrice.AutoSize = true;
            IbPrice.Location = new Point(394, 31);
            IbPrice.Name = "IbPrice";
            IbPrice.Size = new Size(41, 20);
            IbPrice.TabIndex = 9;
            IbPrice.Text = "Price";
            // 
            // IbManufacturer
            // 
            IbManufacturer.AutoSize = true;
            IbManufacturer.Location = new Point(53, 100);
            IbManufacturer.Name = "IbManufacturer";
            IbManufacturer.Size = new Size(97, 20);
            IbManufacturer.TabIndex = 8;
            IbManufacturer.Text = "Manufacturer";
            // 
            // txtCarName
            // 
            txtCarName.Location = new Point(174, 59);
            txtCarName.Name = "txtCarName";
            txtCarName.Size = new Size(179, 27);
            txtCarName.TabIndex = 12;
            // 
            // txtCarID
            // 
            txtCarID.Location = new Point(174, 24);
            txtCarID.Name = "txtCarID";
            txtCarID.Size = new Size(179, 27);
            txtCarID.TabIndex = 11;
            // 
            // txtManufacturer
            // 
            txtManufacturer.Location = new Point(174, 97);
            txtManufacturer.Name = "txtManufacturer";
            txtManufacturer.Size = new Size(179, 27);
            txtManufacturer.TabIndex = 13;
            // 
            // txtReleaseYear
            // 
            txtReleaseYear.Location = new Point(500, 31);
            txtReleaseYear.Name = "txtReleaseYear";
            txtReleaseYear.Size = new Size(189, 27);
            txtReleaseYear.TabIndex = 14;
            // 
            // txtPrice
            // 
            txtPrice.Location = new Point(501, 66);
            txtPrice.Name = "txtPrice";
            txtPrice.Size = new Size(188, 27);
            txtPrice.TabIndex = 15;
            // 
            // btnLoad
            // 
            btnLoad.BackColor = SystemColors.AppWorkspace;
            btnLoad.DialogResult = DialogResult.OK;
            btnLoad.Location = new Point(183, 157);
            btnLoad.Name = "btnLoad";
            btnLoad.Size = new Size(124, 29);
            btnLoad.TabIndex = 16;
            btnLoad.Text = "Load";
            btnLoad.UseVisualStyleBackColor = false;
            btnLoad.Click += btnLoad_Click;
            // 
            // btnNew
            // 
            btnNew.BackColor = SystemColors.AppWorkspace;
            btnNew.DialogResult = DialogResult.OK;
            btnNew.Location = new Point(368, 157);
            btnNew.Name = "btnNew";
            btnNew.Size = new Size(124, 29);
            btnNew.TabIndex = 17;
            btnNew.Text = "New";
            btnNew.UseVisualStyleBackColor = false;
            btnNew.Click += btnNew_Click;
            // 
            // btnDelete
            // 
            btnDelete.BackColor = SystemColors.AppWorkspace;
            btnDelete.DialogResult = DialogResult.OK;
            btnDelete.Location = new Point(554, 157);
            btnDelete.Name = "btnDelete";
            btnDelete.Size = new Size(124, 29);
            btnDelete.TabIndex = 18;
            btnDelete.Text = "Delete";
            btnDelete.UseVisualStyleBackColor = false;
            btnDelete.Click += btnDelete_Click;
            // 
            // dgvCarList
            // 
            dgvCarList.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dgvCarList.Location = new Point(80, 213);
            dgvCarList.Name = "dgvCarList";
            dgvCarList.ReadOnly = true;
            dgvCarList.RowHeadersWidth = 51;
            dgvCarList.RowTemplate.Height = 29;
            dgvCarList.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
            dgvCarList.Size = new Size(680, 188);
            dgvCarList.TabIndex = 19;
            // 
            // frmCarManagement
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = SystemColors.ControlLightLight;
            ClientSize = new Size(800, 450);
            Controls.Add(dgvCarList);
            Controls.Add(btnDelete);
            Controls.Add(btnNew);
            Controls.Add(btnLoad);
            Controls.Add(txtPrice);
            Controls.Add(txtReleaseYear);
            Controls.Add(txtManufacturer);
            Controls.Add(txtCarName);
            Controls.Add(txtCarID);
            Controls.Add(IbReleaseYear);
            Controls.Add(IbPrice);
            Controls.Add(IbManufacturer);
            Controls.Add(IbCarName);
            Controls.Add(label5);
            Controls.Add(IbCarID);
            Name = "frmCarManagement";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Car Management";
            Load += frmCarManagement_Load;
            ((System.ComponentModel.ISupportInitialize)dgvCarList).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label IbCarID;
        private Label label5;
        private Label IbCarName;
        private Label IbReleaseYear;
        private Label IbPrice;
        private Label IbManufacturer;
        private TextBox txtCarName;
        private TextBox txtCarID;
        private TextBox txtManufacturer;
        private TextBox txtReleaseYear;
        private TextBox txtPrice;
        private Button btnLoad;
        private Button btnNew;
        private Button btnDelete;
        private DataGridView dgvCarList;
    }
}