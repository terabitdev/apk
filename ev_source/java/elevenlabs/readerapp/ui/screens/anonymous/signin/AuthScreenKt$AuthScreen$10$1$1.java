package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import android.app.Activity;
import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import q6.s;
import q6.t;
import sn.z;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthScreenKt$AuthScreen$10$1$1", f = "AuthScreen.kt", l = {123}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthScreenKt$AuthScreen$10$1$1 extends yn.i implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ q6.j $credentialManager;
    final /* synthetic */ AuthViewModel $vm;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthScreenKt$AuthScreen$10$1$1(Context context, q6.j jVar, AuthViewModel authViewModel, wn.c<? super AuthScreenKt$AuthScreen$10$1$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$credentialManager = jVar;
        this.$vm = authViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthScreenKt$AuthScreen$10$1$1(this.$context, this.$credentialManager, this.$vm, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthScreenKt$AuthScreen$10$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                xg.b bVar = new xg.b();
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar);
                s sVar = new s(o.g1(arrayList));
                Context context = this.$context;
                context.getClass();
                q6.j jVar = this.$credentialManager;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                jVar.getClass();
                obj = q6.j.a((Activity) context, sVar, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            AuthScreenKt.handleCredentialResult((t) obj, this.$vm);
        } catch (CancellationException e10) {
            throw e10;
        } catch (r6.d unused) {
            this.$vm.onGoogleSignInCancelled();
        } catch (r6.f e11) {
            this.$vm.onGoogleSignInError(e11);
        } catch (Exception e12) {
            this.$vm.onGoogleSignInError(e12);
        }
        return z.f31622a;
    }
}
