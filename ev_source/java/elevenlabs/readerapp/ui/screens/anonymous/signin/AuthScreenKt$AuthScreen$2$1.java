package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import android.app.Activity;
import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.r0;
import ho.p;
import io.elevenlabs.readerapp.BuildConfig;
import io.elevenlabs.readerapp.usecase.ValidateHCaptchaResult;
import io.elevenlabs.readerapp.usecase.ValidateHCaptchaUseCaseKt;
import kotlin.Metadata;
import kr.o;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthScreenKt$AuthScreen$2$1", f = "AuthScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthScreenKt$AuthScreen$2$1 extends yn.i implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ d0 $scope;
    final /* synthetic */ SignInState $state;
    final /* synthetic */ AuthViewModel $vm;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthScreenKt$AuthScreen$2$1$1", f = "AuthScreen.kt", l = {64}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthScreenKt$AuthScreen$2$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        final /* synthetic */ Context $context;
        final /* synthetic */ AuthViewModel $vm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, AuthViewModel authViewModel, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = context;
            this.$vm = authViewModel;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$context, this.$vm, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                    anonymousClass1 = this;
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                Context context = this.$context;
                context.getClass();
                Activity activity = (Activity) context;
                mr.e eVar = r0.f9888a;
                gr.c cVar = o.f20734a;
                this.label = 1;
                anonymousClass1 = this;
                obj = ValidateHCaptchaUseCaseKt.validateHCaptcha$default(activity, BuildConfig.HCAPTCHA_SITE_KEY, cVar, null, null, false, anonymousClass1, 56, null);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            anonymousClass1.$vm.onHCaptchaResult((ValidateHCaptchaResult) obj);
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthScreenKt$AuthScreen$2$1(SignInState signInState, d0 d0Var, Context context, AuthViewModel authViewModel, wn.c<? super AuthScreenKt$AuthScreen$2$1> cVar) {
        super(2, cVar);
        this.$state = signInState;
        this.$scope = d0Var;
        this.$context = context;
        this.$vm = authViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthScreenKt$AuthScreen$2$1(this.$state, this.$scope, this.$context, this.$vm, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthScreenKt$AuthScreen$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.$state.getShowHCaptcha()) {
                g0.D(this.$scope, null, null, new AnonymousClass1(this.$context, this.$vm, null), 3);
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
