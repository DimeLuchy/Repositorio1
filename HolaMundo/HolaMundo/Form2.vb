Public Class Form2

    Private Sub Timer1_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Timer1.Tick
        Label1.Text += 1

        If Label1.Text = "15" Then
            PictureBox2.Visible = True And PictureBox3.Visible = False And PictureBox4.Visible = False And PictureBox5.Visible = False And PictureBox5.Visible = False And PictureBox6.Visible = False And PictureBox7.Visible = False And PictureBox8.Visible = False And PictureBox9.Visible = False And PictureBox10.Visible = False And PictureBox11.Visible = False
        End If

        If Label1.Text = "30" Then
            PictureBox3.Visible = True And PictureBox4.Visible = False And PictureBox5.Visible = False And PictureBox5.Visible = False And PictureBox6.Visible = False And PictureBox7.Visible = False And PictureBox8.Visible = False And PictureBox9.Visible = False And PictureBox10.Visible = False And PictureBox11.Visible = False
        End If

        If Label1.Text = "45" Then
            PictureBox4.Visible = True And PictureBox5.Visible = False And PictureBox5.Visible = False And PictureBox6.Visible = False And PictureBox7.Visible = False And PictureBox8.Visible = False And PictureBox9.Visible = False And PictureBox10.Visible = False And PictureBox11.Visible = False

        End If

        If Label1.Text = "60" Then
            PictureBox5.Visible = True And PictureBox6.Visible = False And PictureBox7.Visible = False And PictureBox8.Visible = False And PictureBox9.Visible = False And PictureBox10.Visible = False And PictureBox11.Visible = False

        End If

        If Label1.Text = "75" Then
            PictureBox6.Visible = True And PictureBox7.Visible = False And PictureBox8.Visible = False And PictureBox9.Visible = False And PictureBox10.Visible = False And PictureBox11.Visible = False

        End If

        If Label1.Text = "90" Then
            PictureBox7.Visible = True And PictureBox8.Visible = False And PictureBox9.Visible = False And PictureBox10.Visible = False And PictureBox11.Visible = False
        End If

        If Label1.Text = "105" Then
            PictureBox8.Visible = True And PictureBox9.Visible = False And PictureBox10.Visible = False And PictureBox11.Visible = False
        End If

        If Label1.Text = "120" Then
            PictureBox9.Visible = True And PictureBox10.Visible = False And PictureBox11.Visible = False
        End If

        If Label1.Text = "135" Then
            PictureBox10.Visible = True And PictureBox11.Visible = False
        End If

        If Label1.Text = "150" Then
            PictureBox11.Visible = True
        End If
        If Label1.Text = "153" Then
            Form3.Show()
        End If

    End Sub

    Private Sub Form2_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Timer1.Start()
        Label1.Visible = False
        PictureBox2.Visible = False
        PictureBox3.Visible = False
        PictureBox4.Visible = False
        PictureBox5.Visible = False
        PictureBox6.Visible = False
        PictureBox7.Visible = False
        PictureBox8.Visible = False
        PictureBox9.Visible = False
        PictureBox10.Visible = False
        PictureBox11.Visible = False
    End Sub

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click
        

    End Sub
End Class