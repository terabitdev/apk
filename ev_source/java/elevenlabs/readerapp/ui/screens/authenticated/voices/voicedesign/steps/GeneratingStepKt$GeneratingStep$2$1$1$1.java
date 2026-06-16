package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import u2.w0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.GeneratingStepKt$GeneratingStep$2$1$1$1", f = "GeneratingStep.kt", l = {86}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class GeneratingStepKt$GeneratingStep$2$1$1$1 extends yn.i implements p {
    final /* synthetic */ w0 $hueRotation$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneratingStepKt$GeneratingStep$2$1$1$1(w0 w0Var, wn.c<? super GeneratingStepKt$GeneratingStep$2$1$1$1> cVar) {
        super(2, cVar);
        this.$hueRotation$delegate = w0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new GeneratingStepKt$GeneratingStep$2$1$1$1(this.$hueRotation$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((GeneratingStepKt$GeneratingStep$2$1$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x001f -> B:5:0x0022). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            sn.a.g(r5)
            goto L22
        Lb:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.google.protobuf.c6.x(r5)
            r5 = 0
            return r5
        L12:
            sn.a.g(r5)
        L15:
            r4.label = r1
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = fr.g0.m(r2, r4)
            xn.a r0 = xn.a.f37986a
            if (r5 != r0) goto L22
            return r0
        L22:
            u2.w0 r5 = r4.$hueRotation$delegate
            float r0 = io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.GeneratingStepKt.access$GeneratingStep$lambda$1$0$2(r5)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 + r2
            r2 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r2
            io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.GeneratingStepKt.access$GeneratingStep$lambda$1$0$3(r5, r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.GeneratingStepKt$GeneratingStep$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
