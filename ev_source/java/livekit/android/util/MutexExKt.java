package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import or.a;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {TokenNames.T, "Lor/a;", "Lkotlin/Function0;", "Lsn/z;", "check", "action", "withCheckLock", "(Lor/a;Lho/a;Lho/a;Lwn/c;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MutexExKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withCheckLock(a aVar, ho.a aVar2, ho.a aVar3, c<? super T> cVar) {
        MutexExKt$withCheckLock$1 mutexExKt$withCheckLock$1;
        int i10;
        try {
            if (cVar instanceof MutexExKt$withCheckLock$1) {
                mutexExKt$withCheckLock$1 = (MutexExKt$withCheckLock$1) cVar;
                int i11 = mutexExKt$withCheckLock$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    mutexExKt$withCheckLock$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = mutexExKt$withCheckLock$1.result;
                    i10 = mutexExKt$withCheckLock$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            aVar = (a) mutexExKt$withCheckLock$1.L$2;
                            aVar3 = (ho.a) mutexExKt$withCheckLock$1.L$1;
                            aVar2 = (ho.a) mutexExKt$withCheckLock$1.L$0;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        aVar2.invoke();
                        mutexExKt$withCheckLock$1.L$0 = aVar2;
                        mutexExKt$withCheckLock$1.L$1 = aVar3;
                        mutexExKt$withCheckLock$1.L$2 = aVar;
                        mutexExKt$withCheckLock$1.label = 1;
                        Object a10 = aVar.a(mutexExKt$withCheckLock$1);
                        xn.a aVar4 = xn.a.f37986a;
                        if (a10 == aVar4) {
                            return aVar4;
                        }
                    }
                    aVar2.invoke();
                    return aVar3.invoke();
                }
            }
            aVar2.invoke();
            return aVar3.invoke();
        } finally {
            aVar.n(null);
        }
        mutexExKt$withCheckLock$1 = new MutexExKt$withCheckLock$1(cVar);
        Object obj2 = mutexExKt$withCheckLock$1.result;
        i10 = mutexExKt$withCheckLock$1.label;
        if (i10 == 0) {
        }
    }

    private static final <T> Object withCheckLock$$forInline(a aVar, ho.a aVar2, ho.a aVar3, c<? super T> cVar) {
        aVar2.invoke();
        aVar.a(cVar);
        try {
            aVar2.invoke();
            return aVar3.invoke();
        } finally {
            aVar.n(null);
        }
    }
}
