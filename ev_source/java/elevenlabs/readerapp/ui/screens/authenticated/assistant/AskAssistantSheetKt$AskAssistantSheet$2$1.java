package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantSheetKt$AskAssistantSheet$2$1", f = "AskAssistantSheet.kt", l = {120}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAssistantSheetKt$AskAssistantSheet$2$1 extends yn.i implements ho.p {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isAppInForeground;
    final /* synthetic */ AskAssistantViewModel $vm;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantSheetKt$AskAssistantSheet$2$1(boolean z6, Context context, AskAssistantViewModel askAssistantViewModel, wn.c<? super AskAssistantSheetKt$AskAssistantSheet$2$1> cVar) {
        super(2, cVar);
        this.$isAppInForeground = z6;
        this.$context = context;
        this.$vm = askAssistantViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AskAssistantSheetKt$AskAssistantSheet$2$1(this.$isAppInForeground, this.$context, this.$vm, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AskAssistantSheetKt$AskAssistantSheet$2$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        boolean z6;
        int i11 = this.label;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.I$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            if (this.$isAppInForeground) {
                if (y5.c.a(this.$context, "android.permission.RECORD_AUDIO") == 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    AskAssistantViewModel askAssistantViewModel = this.$vm;
                    this.I$0 = i10;
                    this.label = 1;
                    obj = askAssistantViewModel.hasAskedForMicPermissionBefore(this);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    z6 = false;
                    AskAssistantViewModel askAssistantViewModel2 = this.$vm;
                    if (i10 != 0) {
                        z10 = true;
                    }
                    askAssistantViewModel2.checkMicPermissionState(z10, z6);
                }
            }
            return sn.z.f31622a;
        }
        z6 = AskAssistantSheetKt.isPermissionPermanentlyDenied(this.$context, "android.permission.RECORD_AUDIO", ((Boolean) obj).booleanValue());
        AskAssistantViewModel askAssistantViewModel22 = this.$vm;
        if (i10 != 0) {
        }
        askAssistantViewModel22.checkMicPermissionState(z10, z6);
        return sn.z.f31622a;
    }
}
