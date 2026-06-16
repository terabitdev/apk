package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import i4.x1;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SpeedPickerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.StackedBookCoversKt;
import p3.i0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15156b;

    public /* synthetic */ r(float f10, int i10) {
        this.f15155a = i10;
        this.f15156b = f10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AssistantContract.State onVadScore$lambda$4;
        sn.z SpeedPickerSheetUI$lambda$4$0$0$0$0;
        sn.z SpeedPickerSheetUI$lambda$4$0$3$1$0$0;
        sn.z Cover$lambda$0$0;
        switch (this.f15155a) {
            case 0:
                onVadScore$lambda$4 = AskAssistantViewModel$sessionListener$1.onVadScore$lambda$4(this.f15156b, (AssistantContract.State) obj);
                return onVadScore$lambda$4;
            case 1:
                SpeedPickerSheetUI$lambda$4$0$0$0$0 = SpeedPickerSheetKt.SpeedPickerSheetUI$lambda$4$0$0$0$0(this.f15156b, (PlayerViewModel) obj);
                return SpeedPickerSheetUI$lambda$4$0$0$0$0;
            case 2:
                SpeedPickerSheetUI$lambda$4$0$3$1$0$0 = SpeedPickerSheetKt.SpeedPickerSheetUI$lambda$4$0$3$1$0$0(this.f15156b, (PlayerViewModel) obj);
                return SpeedPickerSheetUI$lambda$4$0$3$1$0$0;
            case 3:
                Cover$lambda$0$0 = StackedBookCoversKt.Cover$lambda$0$0(this.f15156b, (i0) obj);
                return Cover$lambda$0$0;
            default:
                x1 x1Var = (x1) obj;
                x1Var.f13260a = "padding";
                x1Var.f13261b = new h5.f(this.f15156b);
                return sn.z.f31622a;
        }
    }
}
