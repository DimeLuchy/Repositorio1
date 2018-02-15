Public Class Form3

    Private Sub Timer1_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Timer1.Tick
        Static C As Integer
        C = C + 1

        If C = 1 Then
            Label1.ForeColor = Color.Purple
            Label2.ForeColor = Color.RosyBrown
            Label3.ForeColor = Color.Gold
            Label4.ForeColor = Color.BurlyWood
            Label5.ForeColor = Color.Fuchsia
            Label6.ForeColor = Color.Violet
            Label7.ForeColor = Color.Aqua
            Label8.ForeColor = Color.Red
            Label9.ForeColor = Color.DarkSalmon
            Label10.ForeColor = Color.LightYellow
            Label11.ForeColor = Color.Silver
            Label12.ForeColor = Color.LemonChiffon
            Label13.ForeColor = Color.Red
            Label14.ForeColor = Color.DarkOrange
            Label15.ForeColor = Color.DarkOliveGreen
            Label16.ForeColor = Color.IndianRed
            Label17.ForeColor = Color.Violet



        ElseIf C = 2 Then
            Label1.ForeColor = Color.Coral
            Label2.ForeColor = Color.IndianRed
            Label3.ForeColor = Color.YellowGreen
            Label4.ForeColor = Color.Aqua
            Label5.ForeColor = Color.Orange
            Label6.ForeColor = Color.Violet
            Label7.ForeColor = Color.RoyalBlue
            Label8.ForeColor = Color.Transparent
            Label9.ForeColor = Color.Pink
            Label10.ForeColor = Color.Blue
            Label11.ForeColor = Color.Coral
            Label12.ForeColor = Color.Green
            Label13.ForeColor = Color.Orange
            Label14.ForeColor = Color.Violet
            Label15.ForeColor = Color.Fuchsia
            Label16.ForeColor = Color.Red
            Label17.ForeColor = Color.Blue
        ElseIf C = 3 Then
            Label1.ForeColor = Color.IndianRed
            Label2.ForeColor = Color.PapayaWhip
            Label3.ForeColor = Color.Gold
            Label4.ForeColor = Color.Peru
            Label5.ForeColor = Color.Fuchsia
            Label6.ForeColor = Color.Red
            Label7.ForeColor = Color.RosyBrown
            Label8.ForeColor = Color.Pink
            Label9.ForeColor = Color.Blue
            Label10.ForeColor = Color.LightSteelBlue
            Label11.ForeColor = Color.Fuchsia
            Label12.ForeColor = Color.Yellow
            Label13.ForeColor = Color.Green
            Label14.ForeColor = Color.Silver
            Label15.ForeColor = Color.Teal
            Label16.ForeColor = Color.DarkSalmon
            Label17.ForeColor = Color.Pink
        ElseIf C = 4 Then
            Label1.ForeColor = Color.BlueViolet
            Label2.ForeColor = Color.PapayaWhip
            Label3.ForeColor = Color.Red
            Label4.ForeColor = Color.DarkSalmon
            Label5.ForeColor = Color.Silver
            Label6.ForeColor = Color.Violet
            Label7.ForeColor = Color.RosyBrown
            Label8.ForeColor = Color.Teal
            Label9.ForeColor = Color.Yellow
            Label10.ForeColor = Color.Orange
            Label11.ForeColor = Color.Green
            Label12.ForeColor = Color.Red
            Label13.ForeColor = Color.Purple
            Label14.ForeColor = Color.Aqua
            Label15.ForeColor = Color.YellowGreen
            Label16.ForeColor = Color.LightSteelBlue
            Label17.ForeColor = Color.Yellow
        ElseIf C = 5 Then
            Label1.ForeColor = Color.Gold
            Label2.ForeColor = Color.Wheat
            Label3.ForeColor = Color.Salmon
            Label4.ForeColor = Color.DarkSalmon
            Label5.ForeColor = Color.Fuchsia
            Label6.ForeColor = Color.Violet
            Label7.ForeColor = Color.RosyBrown
            Label8.ForeColor = Color.Pink
            Label9.ForeColor = Color.Aqua
            Label10.ForeColor = Color.Green
            Label11.ForeColor = Color.Red
            Label12.ForeColor = Color.Orange
            Label13.ForeColor = Color.YellowGreen
            Label14.ForeColor = Color.Silver
            Label15.ForeColor = Color.Teal
            Label16.ForeColor = Color.LavenderBlush
            Label17.ForeColor = Color.Fuchsia
        ElseIf C = 6 Then
            Label1.ForeColor = Color.LightGreen
            Label2.ForeColor = Color.Yellow
            Label3.ForeColor = Color.Violet
            Label4.ForeColor = Color.Aqua
            Label5.ForeColor = Color.LavenderBlush
            Label6.ForeColor = Color.Violet
            Label7.ForeColor = Color.YellowGreen
            Label8.ForeColor = Color.Pink
            Label9.ForeColor = Color.DarkSalmon
            Label10.ForeColor = Color.Red
            Label11.ForeColor = Color.BurlyWood
            Label12.ForeColor = Color.Blue
            Label13.ForeColor = Color.Yellow
            Label14.ForeColor = Color.Teal
            Label15.ForeColor = Color.Purple
            Label16.ForeColor = Color.Aqua
            Label17.ForeColor = Color.DarkSalmon
        Else : C = 7
            C = 0

        End If


    End Sub

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click
        

    End Sub

    Private Sub Form3_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Timer1.Start()
    End Sub
End Class