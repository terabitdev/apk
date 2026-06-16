package io.elevenlabs.readerapp.core.extensions;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.j1;
import fr.k1;
import fr.m1;
import io.elevenlabs.highlighter.d;
import ir.i;
import ir.j;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a;\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfr/d0;", "newChildScope", "(Lfr/d0;)Lfr/d0;", TokenNames.T, "Lir/i;", "", "periodMillis", "Lkotlin/Function0;", "timeSource", "throttleDistinct", "(Lir/i;JLho/a;)Lir/i;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CoroutineExtensionsKt {
    public static final d0 newChildScope(d0 d0Var) {
        d0Var.getClass();
        return g0.F(d0Var, new m1((k1) d0Var.getCoroutineContext().get(j1.f9852a)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    public static final <T> i throttleDistinct(final i iVar, final long j4, final ho.a aVar) {
        iVar.getClass();
        aVar.getClass();
        final ?? obj = new Object();
        final ?? obj2 = new Object();
        return new i() { // from class: io.elevenlabs.readerapp.core.extensions.CoroutineExtensionsKt$throttleDistinct$$inlined$filter$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.core.extensions.CoroutineExtensionsKt$throttleDistinct$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ kotlin.jvm.internal.d0 $lastEvent$inlined;
                final /* synthetic */ c0 $lastEventTime$inlined;
                final /* synthetic */ long $periodMillis$inlined;
                final /* synthetic */ j $this_unsafeFlow;
                final /* synthetic */ ho.a $timeSource$inlined;

                @e(c = "io.elevenlabs.readerapp.core.extensions.CoroutineExtensionsKt$throttleDistinct$$inlined$filter$1$2", f = "CoroutineExtensions.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.core.extensions.CoroutineExtensionsKt$throttleDistinct$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, ho.a aVar, kotlin.jvm.internal.d0 d0Var, c0 c0Var, long j4) {
                    this.$this_unsafeFlow = jVar;
                    this.$timeSource$inlined = aVar;
                    this.$lastEvent$inlined = d0Var;
                    this.$lastEventTime$inlined = c0Var;
                    this.$periodMillis$inlined = j4;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                long longValue = ((Number) this.$timeSource$inlined.invoke()).longValue();
                                if (!m.c(obj, this.$lastEvent$inlined.f20559a) || longValue - this.$lastEventTime$inlined.f20558a > this.$periodMillis$inlined) {
                                    this.$lastEvent$inlined.f20559a = obj;
                                    this.$lastEventTime$inlined.f20558a = longValue;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(obj, anonymousClass1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, aVar, obj, obj2, j4), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    public static /* synthetic */ i throttleDistinct$default(i iVar, long j4, ho.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new d(28);
        }
        return throttleDistinct(iVar, j4, aVar);
    }

    public static final long throttleDistinct$lambda$0() {
        return System.currentTimeMillis();
    }
}
