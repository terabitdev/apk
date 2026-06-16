package io.livekit.android.util;

import kotlin.Metadata;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.util.MutexExKt", f = "MutexEx.kt", l = {38}, m = "withCheckLock")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes4.dex */
public final class MutexExKt$withCheckLock$1<T> extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public MutexExKt$withCheckLock$1(wn.c<? super MutexExKt$withCheckLock$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MutexExKt.withCheckLock(null, null, null, this);
    }
}
