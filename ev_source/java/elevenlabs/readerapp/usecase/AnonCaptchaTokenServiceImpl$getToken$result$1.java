package io.elevenlabs.readerapp.usecase;

import android.app.Activity;
import com.google.protobuf.c6;
import com.hcaptcha.sdk.HCaptchaSize;
import com.hcaptcha.sdk.HCaptchaTheme;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.DispatcherFactory;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.usecase.AnonCaptchaTokenServiceImpl$getToken$result$1", f = "AnonCaptchaTokenServiceImpl.kt", l = {61}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AnonCaptchaTokenServiceImpl$getToken$result$1 extends i implements p {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ AnonCaptchaTokenServiceImpl this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.readerapp.usecase.AnonCaptchaTokenServiceImpl$getToken$result$1$1", f = "AnonCaptchaTokenServiceImpl.kt", l = {62}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.usecase.AnonCaptchaTokenServiceImpl$getToken$result$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Activity $activity;
        int label;
        final /* synthetic */ AnonCaptchaTokenServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, AnonCaptchaTokenServiceImpl anonCaptchaTokenServiceImpl, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$activity = activity;
            this.this$0 = anonCaptchaTokenServiceImpl;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$activity, this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super ValidateHCaptchaResult> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            String str;
            DispatcherFactory dispatcherFactory;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                    return obj;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
            Activity activity = this.$activity;
            str = this.this$0.siteKey;
            dispatcherFactory = this.this$0.dispatcherFactory;
            fr.z main = dispatcherFactory.getMain();
            this.label = 1;
            Object validateHCaptcha = ValidateHCaptchaUseCaseKt.validateHCaptcha(activity, str, main, HCaptchaSize.INVISIBLE, HCaptchaTheme.DARK, false, this);
            xn.a aVar = xn.a.f37986a;
            if (validateHCaptcha == aVar) {
                return aVar;
            }
            return validateHCaptcha;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonCaptchaTokenServiceImpl$getToken$result$1(AnonCaptchaTokenServiceImpl anonCaptchaTokenServiceImpl, Activity activity, c<? super AnonCaptchaTokenServiceImpl$getToken$result$1> cVar) {
        super(2, cVar);
        this.this$0 = anonCaptchaTokenServiceImpl;
        this.$activity = activity;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AnonCaptchaTokenServiceImpl$getToken$result$1(this.this$0, this.$activity, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super ValidateHCaptchaResult> cVar) {
        return ((AnonCaptchaTokenServiceImpl$getToken$result$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        DispatcherFactory dispatcherFactory;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        dispatcherFactory = this.this$0.dispatcherFactory;
        fr.z main = dispatcherFactory.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, this.this$0, null);
        this.label = 1;
        Object Q = g0.Q(main, anonymousClass1, this);
        xn.a aVar = xn.a.f37986a;
        if (Q == aVar) {
            return aVar;
        }
        return Q;
    }
}
