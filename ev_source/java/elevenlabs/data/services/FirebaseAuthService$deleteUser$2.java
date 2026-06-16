package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.AuthService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.FirebaseAuthService$deleteUser$2", f = "FirebaseAuthService.kt", l = {330}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class FirebaseAuthService$deleteUser$2 extends yn.i implements p {
    int label;
    final /* synthetic */ FirebaseAuthService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseAuthService$deleteUser$2(FirebaseAuthService firebaseAuthService, wn.c<? super FirebaseAuthService$deleteUser$2> cVar) {
        super(2, cVar);
        this.this$0 = firebaseAuthService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new FirebaseAuthService$deleteUser$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((FirebaseAuthService$deleteUser$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            FirebaseAuthService firebaseAuthService = this.this$0;
            AuthService.SignOutReason signOutReason = AuthService.SignOutReason.UserInitiated;
            this.label = 1;
            Object signOut = firebaseAuthService.signOut(signOutReason, this);
            xn.a aVar = xn.a.f37986a;
            if (signOut == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
