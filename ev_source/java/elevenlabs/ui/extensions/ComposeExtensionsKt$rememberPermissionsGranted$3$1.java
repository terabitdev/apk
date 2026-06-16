package io.elevenlabs.ui.extensions;

import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import j.j;
import kotlin.Metadata;
import sn.z;
import u2.z0;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ui.extensions.ComposeExtensionsKt$rememberPermissionsGranted$3$1", f = "ComposeExtensions.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ComposeExtensionsKt$rememberPermissionsGranted$3$1 extends i implements p {
    final /* synthetic */ l $checkIsGranted;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isAppInForeground;
    final /* synthetic */ j $permissionLauncher;
    final /* synthetic */ String[] $permissions;
    final /* synthetic */ z0 $permissionsGranted$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeExtensionsKt$rememberPermissionsGranted$3$1(boolean z6, l lVar, Context context, j jVar, String[] strArr, z0 z0Var, wn.c<? super ComposeExtensionsKt$rememberPermissionsGranted$3$1> cVar) {
        super(2, cVar);
        this.$isAppInForeground = z6;
        this.$checkIsGranted = lVar;
        this.$context = context;
        this.$permissionLauncher = jVar;
        this.$permissions = strArr;
        this.$permissionsGranted$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ComposeExtensionsKt$rememberPermissionsGranted$3$1(this.$isAppInForeground, this.$checkIsGranted, this.$context, this.$permissionLauncher, this.$permissions, this.$permissionsGranted$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((ComposeExtensionsKt$rememberPermissionsGranted$3$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.$isAppInForeground) {
                if (((Boolean) this.$checkIsGranted.invoke(this.$context)).booleanValue()) {
                    this.$permissionsGranted$delegate.setValue(Boolean.TRUE);
                } else {
                    this.$permissionLauncher.a(this.$permissions);
                }
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
