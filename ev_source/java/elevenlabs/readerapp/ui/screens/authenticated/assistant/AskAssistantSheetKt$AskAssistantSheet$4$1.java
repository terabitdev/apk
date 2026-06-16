package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import kotlin.Metadata;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantSheetKt$AskAssistantSheet$4$1", f = "AskAssistantSheet.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAssistantSheetKt$AskAssistantSheet$4$1 extends yn.i implements ho.p {
    final /* synthetic */ j.j $permissionLauncher;
    final /* synthetic */ s2 $state$delegate;
    final /* synthetic */ AskAssistantViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantSheetKt$AskAssistantSheet$4$1(AskAssistantViewModel askAssistantViewModel, j.j jVar, s2 s2Var, wn.c<? super AskAssistantSheetKt$AskAssistantSheet$4$1> cVar) {
        super(2, cVar);
        this.$vm = askAssistantViewModel;
        this.$permissionLauncher = jVar;
        this.$state$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AskAssistantSheetKt$AskAssistantSheet$4$1(this.$vm, this.$permissionLauncher, this.$state$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AskAssistantSheetKt$AskAssistantSheet$4$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        AssistantContract.State AskAssistantSheet$lambda$0;
        AssistantContract.State AskAssistantSheet$lambda$02;
        AssistantContract.State AskAssistantSheet$lambda$03;
        AssistantContract.State AskAssistantSheet$lambda$04;
        if (this.label == 0) {
            sn.a.g(obj);
            AskAssistantSheet$lambda$0 = AskAssistantSheetKt.AskAssistantSheet$lambda$0(this.$state$delegate);
            if (!AskAssistantSheet$lambda$0.getShowExplainerMessage()) {
                AskAssistantSheet$lambda$02 = AskAssistantSheetKt.AskAssistantSheet$lambda$0(this.$state$delegate);
                if (!AskAssistantSheet$lambda$02.getShowTermsAcceptance()) {
                    AskAssistantSheet$lambda$03 = AskAssistantSheetKt.AskAssistantSheet$lambda$0(this.$state$delegate);
                    if (!AskAssistantSheet$lambda$03.getHasRequestedInitialPermission()) {
                        AskAssistantSheet$lambda$04 = AskAssistantSheetKt.AskAssistantSheet$lambda$0(this.$state$delegate);
                        if (kotlin.jvm.internal.m.c(AskAssistantSheet$lambda$04.getMicPermissionGranted(), Boolean.TRUE)) {
                            this.$vm.updateMicPermission(true, false);
                        } else {
                            this.$permissionLauncher.a("android.permission.RECORD_AUDIO");
                        }
                    }
                }
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
