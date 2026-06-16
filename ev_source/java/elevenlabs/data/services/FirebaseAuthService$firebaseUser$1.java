package io.elevenlabs.data.services;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.protobuf.c6;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.domain.Logger;
import java.util.Optional;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.FirebaseAuthService$firebaseUser$1", f = "FirebaseAuthService.kt", l = {72, 82}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhr/x;", "Ljava/util/Optional;", "Lcom/google/firebase/auth/FirebaseUser;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class FirebaseAuthService$firebaseUser$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FirebaseAuthService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseAuthService$firebaseUser$1(FirebaseAuthService firebaseAuthService, wn.c<? super FirebaseAuthService$firebaseUser$1> cVar) {
        super(2, cVar);
        this.this$0 = firebaseAuthService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(FirebaseAuthService firebaseAuthService, x xVar, FirebaseAuth firebaseAuth) {
        Logger logger;
        String str;
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        logger = firebaseAuthService.logger;
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "null";
        }
        logger.log("AuthService", "Auth state changed - currentUser.uid: ".concat(str));
        ((w) xVar).d(Optional.ofNullable(currentUser));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z invokeSuspend$lambda$1(FirebaseAuthService firebaseAuthService, FirebaseAuth.AuthStateListener authStateListener) {
        FirebaseAuth firebaseAuth;
        firebaseAuth = firebaseAuthService.auth;
        firebaseAuth.removeAuthStateListener(authStateListener);
        return z.f31622a;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        FirebaseAuthService$firebaseUser$1 firebaseAuthService$firebaseUser$1 = new FirebaseAuthService$firebaseUser$1(this.this$0, cVar);
        firebaseAuthService$firebaseUser$1.L$0 = obj;
        return firebaseAuthService$firebaseUser$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((FirebaseAuthService$firebaseUser$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (n0.l.h(r0, r3, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (((hr.w) r0).f12593d.c(r6, r5) == r4) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.firebase.auth.FirebaseAuth$AuthStateListener, io.elevenlabs.data.services.d] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FirebaseAuth firebaseAuth;
        FirebaseAuth firebaseAuth2;
        final x xVar = (x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            firebaseAuth = this.this$0.auth;
            Optional ofNullable = Optional.ofNullable(firebaseAuth.getCurrentUser());
            this.L$0 = xVar;
            this.label = 1;
        }
        final FirebaseAuthService firebaseAuthService = this.this$0;
        final ?? r12 = new FirebaseAuth.AuthStateListener() { // from class: io.elevenlabs.data.services.d
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public final void onAuthStateChanged(FirebaseAuth firebaseAuth3) {
                FirebaseAuthService$firebaseUser$1.invokeSuspend$lambda$0(FirebaseAuthService.this, xVar, firebaseAuth3);
            }
        };
        firebaseAuth2 = firebaseAuthService.auth;
        firebaseAuth2.addAuthStateListener(r12);
        final FirebaseAuthService firebaseAuthService2 = this.this$0;
        ho.a aVar2 = new ho.a() { // from class: io.elevenlabs.data.services.e
            @Override // ho.a
            public final Object invoke() {
                z invokeSuspend$lambda$1;
                invokeSuspend$lambda$1 = FirebaseAuthService$firebaseUser$1.invokeSuspend$lambda$1(FirebaseAuthService.this, r12);
                return invokeSuspend$lambda$1;
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
