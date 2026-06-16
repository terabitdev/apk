package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$handlePermissionResult$1", f = "AskAssistantViewModel.kt", l = {252}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAssistantViewModel$handlePermissionResult$1 extends yn.i implements ho.p {
    final /* synthetic */ boolean $granted;
    final /* synthetic */ boolean $isPermanentlyDenied;
    int label;
    final /* synthetic */ AskAssistantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantViewModel$handlePermissionResult$1(AskAssistantViewModel askAssistantViewModel, boolean z6, boolean z10, wn.c<? super AskAssistantViewModel$handlePermissionResult$1> cVar) {
        super(2, cVar);
        this.this$0 = askAssistantViewModel;
        this.$granted = z6;
        this.$isPermanentlyDenied = z10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AskAssistantViewModel$handlePermissionResult$1(this.this$0, this.$granted, this.$isPermanentlyDenied, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AskAssistantViewModel$handlePermissionResult$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            aVar = this.this$0.runtimePermissionsService;
            RuntimePermissionsService runtimePermissionsService = (RuntimePermissionsService) aVar.get();
            this.label = 1;
            Object askedForPermission = runtimePermissionsService.askedForPermission("android.permission.RECORD_AUDIO", this);
            xn.a aVar2 = xn.a.f37986a;
            if (askedForPermission == aVar2) {
                return aVar2;
            }
        }
        this.this$0.updateMicPermission(this.$granted, true);
        boolean z6 = this.$granted;
        AskAssistantViewModel askAssistantViewModel = this.this$0;
        if (!z6) {
            askAssistantViewModel.updateMicPermissionPermanentlyDenied(this.$isPermanentlyDenied);
        } else {
            askAssistantViewModel.updateMicPermissionPermanentlyDenied(false);
        }
        this.this$0.queueStateUpdate(new o(1));
        return sn.z.f31622a;
    }
}
