package io.elevenlabs.ui;

import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import u2.z0;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ui.AccessibilityExtensionsKt$collectIsTalkbackEnabledAsState$2$1", f = "AccessibilityExtensions.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AccessibilityExtensionsKt$collectIsTalkbackEnabledAsState$2$1 extends i implements p {
    final /* synthetic */ z0 $accessibilityEnabled$delegate;
    final /* synthetic */ z0 $talkbackEnabled;
    final /* synthetic */ Context $this_collectIsTalkbackEnabledAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityExtensionsKt$collectIsTalkbackEnabledAsState$2$1(z0 z0Var, Context context, z0 z0Var2, c<? super AccessibilityExtensionsKt$collectIsTalkbackEnabledAsState$2$1> cVar) {
        super(2, cVar);
        this.$talkbackEnabled = z0Var;
        this.$this_collectIsTalkbackEnabledAsState = context;
        this.$accessibilityEnabled$delegate = z0Var2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AccessibilityExtensionsKt$collectIsTalkbackEnabledAsState$2$1(this.$talkbackEnabled, this.$this_collectIsTalkbackEnabledAsState, this.$accessibilityEnabled$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((AccessibilityExtensionsKt$collectIsTalkbackEnabledAsState$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean collectIsTalkbackEnabledAsState$lambda$3;
        boolean z6;
        if (this.label == 0) {
            sn.a.g(obj);
            z0 z0Var = this.$talkbackEnabled;
            collectIsTalkbackEnabledAsState$lambda$3 = AccessibilityExtensionsKt.collectIsTalkbackEnabledAsState$lambda$3(this.$accessibilityEnabled$delegate);
            if (collectIsTalkbackEnabledAsState$lambda$3) {
                z6 = AccessibilityExtensionsKt.isScreenReaderOn(this.$this_collectIsTalkbackEnabledAsState);
            } else {
                z6 = false;
            }
            z0Var.setValue(Boolean.valueOf(z6));
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
