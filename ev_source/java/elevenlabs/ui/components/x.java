package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17695b;

    public /* synthetic */ x(int i10, int i11) {
        this.f17694a = i11;
        this.f17695b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Preview_Callout_Large$lambda$1;
        sn.z Preview_Checkbox$lambda$1;
        sn.z Preview_Chip$lambda$1;
        sn.z Preview_ConfirmationDialog$lambda$2;
        sn.z Preview_ConfirmationDialog_No_Button$lambda$2;
        sn.z Preview_ConfirmationDialog_NotDanger$lambda$2;
        sn.z Preview_ConfirmationDialog_No_Buttons$lambda$2;
        sn.z Preview_ConfirmationDialog_No_Title$lambda$2;
        sn.z Preview_EchoCloseButton$lambda$1;
        sn.z Preview_EchoRadioButton$lambda$1;
        int i10 = this.f17694a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Preview_Callout_Large$lambda$1 = CalloutKt.Preview_Callout_Large$lambda$1(this.f17695b, mVar, intValue);
                return Preview_Callout_Large$lambda$1;
            case 1:
                Preview_Checkbox$lambda$1 = CheckboxKt.Preview_Checkbox$lambda$1(this.f17695b, mVar, intValue);
                return Preview_Checkbox$lambda$1;
            case 2:
                return ChipGroupKt.c(this.f17695b, mVar, intValue);
            case 3:
                return ChipGroupKt.d(this.f17695b, mVar, intValue);
            case 4:
                Preview_Chip$lambda$1 = ChipKt.Preview_Chip$lambda$1(this.f17695b, mVar, intValue);
                return Preview_Chip$lambda$1;
            case 5:
                Preview_ConfirmationDialog$lambda$2 = ConfirmationDialogKt.Preview_ConfirmationDialog$lambda$2(this.f17695b, mVar, intValue);
                return Preview_ConfirmationDialog$lambda$2;
            case 6:
                Preview_ConfirmationDialog_No_Button$lambda$2 = ConfirmationDialogKt.Preview_ConfirmationDialog_No_Button$lambda$2(this.f17695b, mVar, intValue);
                return Preview_ConfirmationDialog_No_Button$lambda$2;
            case 7:
                Preview_ConfirmationDialog_NotDanger$lambda$2 = ConfirmationDialogKt.Preview_ConfirmationDialog_NotDanger$lambda$2(this.f17695b, mVar, intValue);
                return Preview_ConfirmationDialog_NotDanger$lambda$2;
            case 8:
                Preview_ConfirmationDialog_No_Buttons$lambda$2 = ConfirmationDialogKt.Preview_ConfirmationDialog_No_Buttons$lambda$2(this.f17695b, mVar, intValue);
                return Preview_ConfirmationDialog_No_Buttons$lambda$2;
            case 9:
                Preview_ConfirmationDialog_No_Title$lambda$2 = ConfirmationDialogKt.Preview_ConfirmationDialog_No_Title$lambda$2(this.f17695b, mVar, intValue);
                return Preview_ConfirmationDialog_No_Title$lambda$2;
            case 10:
                return EchoButtonKt.d(this.f17695b, mVar, intValue);
            case 11:
                return EchoButtonKt.k(this.f17695b, mVar, intValue);
            case 12:
                return EchoButtonKt.b(this.f17695b, mVar, intValue);
            case 13:
                return EchoButtonKt.i(this.f17695b, mVar, intValue);
            case 14:
                return EchoButtonKt.j(this.f17695b, mVar, intValue);
            case 15:
                return EchoButtonKt.h(this.f17695b, mVar, intValue);
            case 16:
                return EchoButtonKt.a(this.f17695b, mVar, intValue);
            case 17:
                Preview_EchoCloseButton$lambda$1 = EchoCloseButtonKt.Preview_EchoCloseButton$lambda$1(this.f17695b, mVar, intValue);
                return Preview_EchoCloseButton$lambda$1;
            case 18:
                return EchoIconButtonKt.e(this.f17695b, mVar, intValue);
            case 19:
                return EchoIconButtonKt.i(this.f17695b, mVar, intValue);
            case 20:
                return EchoIconButtonKt.a(this.f17695b, mVar, intValue);
            case 21:
                return EchoIconButtonKt.j(this.f17695b, mVar, intValue);
            case 22:
                return EchoIconButtonKt.d(this.f17695b, mVar, intValue);
            case 23:
                return EchoIconButtonKt.b(this.f17695b, mVar, intValue);
            case 24:
                return EchoIconButtonKt.h(this.f17695b, mVar, intValue);
            case 25:
                return EchoInputSearchKt.e(this.f17695b, mVar, intValue);
            case 26:
                return EchoInputSearchKt.c(this.f17695b, mVar, intValue);
            case 27:
                Preview_EchoRadioButton$lambda$1 = EchoRadioButtonKt.Preview_EchoRadioButton$lambda$1(this.f17695b, mVar, intValue);
                return Preview_EchoRadioButton$lambda$1;
            case 28:
                return EchoToggleKt.d(this.f17695b, mVar, intValue);
            default:
                return EchoToggleKt.a(this.f17695b, mVar, intValue);
        }
    }
}
