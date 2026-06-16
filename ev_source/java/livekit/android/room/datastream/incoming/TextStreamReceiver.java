package io.livekit.android.room.datastream.incoming;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import hr.n;
import io.livekit.android.room.datastream.TextStreamInfo;
import ir.d;
import ir.i;
import ir.j;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.z;
import wq.b;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/livekit/android/room/datastream/incoming/TextStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/BaseStreamReceiver;", "", "Lio/livekit/android/room/datastream/TextStreamInfo;", ParameterNames.INFO, "Lhr/n;", "", "source", "<init>", "(Lio/livekit/android/room/datastream/TextStreamInfo;Lhr/n;)V", "Lio/livekit/android/room/datastream/TextStreamInfo;", "getInfo", "()Lio/livekit/android/room/datastream/TextStreamInfo;", "Lir/i;", "flow", "Lir/i;", "getFlow", "()Lir/i;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TextStreamReceiver extends BaseStreamReceiver<String> {
    private final i flow;
    private final TextStreamInfo info;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStreamReceiver(TextStreamInfo textStreamInfo, n nVar) {
        super(nVar);
        textStreamInfo.getClass();
        nVar.getClass();
        this.info = textStreamInfo;
        final d B = r.B(nVar);
        this.flow = new i() { // from class: io.livekit.android.room.datastream.incoming.TextStreamReceiver$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.datastream.incoming.TextStreamReceiver$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.datastream.incoming.TextStreamReceiver$special$$inlined$map$1$2", f = "TextStreamReceiver.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.datastream.incoming.TextStreamReceiver$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
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

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
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
                                    a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                String str = new String((byte[]) obj, b.f37231a);
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(str, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
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
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    @Override // io.livekit.android.room.datastream.incoming.BaseStreamReceiver
    public i getFlow() {
        return this.flow;
    }

    public final TextStreamInfo getInfo() {
        return this.info;
    }
}
