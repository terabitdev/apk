package io.livekit.android.room.participant;

import a7.u;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.util.FlowDelegateKt;
import ir.j;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jr.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.k;
import sn.z;
import tn.o;
import tn.p;
import tn.t;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.Participant$trackUpdateFlow$$inlined$flatMapLatest$1", f = "Participant.kt", l = {190}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {TokenNames.T, TokenNames.R, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Participant$trackUpdateFlow$$inlined$flatMapLatest$1 extends i implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public Participant$trackUpdateFlow$$inlined$flatMapLatest$1(c cVar) {
        super(3, cVar);
    }

    public final Object invoke(j jVar, Map<String, ? extends TrackPublication> map, c<? super z> cVar) {
        Participant$trackUpdateFlow$$inlined$flatMapLatest$1 participant$trackUpdateFlow$$inlined$flatMapLatest$1 = new Participant$trackUpdateFlow$$inlined$flatMapLatest$1(cVar);
        participant$trackUpdateFlow$$inlined$flatMapLatest$1.L$0 = jVar;
        participant$trackUpdateFlow$$inlined$flatMapLatest$1.L$1 = map;
        return participant$trackUpdateFlow$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i iVar;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            j jVar = (j) this.L$0;
            Map map = (Map) this.L$1;
            if (map.isEmpty()) {
                iVar = new u(t.f33547a, 3);
            } else {
                Collection<TrackPublication> values = map.values();
                ArrayList arrayList = new ArrayList(p.a0(values, 10));
                for (final TrackPublication trackPublication : values) {
                    final z1 flow = FlowDelegateKt.getFlow(new kotlin.jvm.internal.p(trackPublication) { // from class: io.livekit.android.room.participant.Participant$trackUpdateFlow$1$1$1
                        @Override // kotlin.jvm.internal.p, oo.r
                        public Object get() {
                            return ((TrackPublication) this.receiver).getTrack();
                        }

                        public void set(Object obj2) {
                            ((TrackPublication) this.receiver).setTrack$livekit_android_sdk_release((Track) obj2);
                        }
                    });
                    arrayList.add(new ir.i() { // from class: io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$lambda$1$$inlined$map$1

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                        /* renamed from: io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$lambda$1$$inlined$map$1$2, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass2<T> implements j {
                            final /* synthetic */ j $this_unsafeFlow;
                            final /* synthetic */ TrackPublication $trackPublication$inlined;

                            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                            @e(c = "io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$lambda$1$$inlined$map$1$2", f = "Participant.kt", l = {223}, m = "emit")
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                            /* renamed from: io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                            /* loaded from: classes4.dex */
                            public static final class AnonymousClass1 extends yn.c {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(c cVar) {
                                    super(cVar);
                                }

                                @Override // yn.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(j jVar, TrackPublication trackPublication) {
                                this.$this_unsafeFlow = jVar;
                                this.$trackPublication$inlined = trackPublication;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                            @Override // ir.j
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, c cVar) {
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
                                            TrackPublication trackPublication = this.$trackPublication$inlined;
                                            k kVar = new k(trackPublication, trackPublication.getTrack());
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(kVar, anonymousClass1);
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
                        public Object collect(j jVar2, c cVar) {
                            Object collect = ir.i.this.collect(new AnonymousClass2(jVar2, trackPublication), cVar);
                            if (collect == xn.a.f37986a) {
                                return collect;
                            }
                            return z.f31622a;
                        }
                    });
                }
                Object[] array = o.g1(arrayList).toArray(new ir.i[0]);
                if (array != null) {
                    final ir.i[] iVarArr = (ir.i[]) array;
                    iVar = new ir.i() { // from class: io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$$inlined$combine$1

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, TokenNames.R, "", "invoke", "()[Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                        /* renamed from: io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$$inlined$combine$1$2, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass2 extends n implements ho.a {
                            final /* synthetic */ ir.i[] $flowArray;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(ir.i[] iVarArr) {
                                super(0);
                                this.$flowArray = iVarArr;
                            }

                            @Override // ho.a
                            public final k[] invoke() {
                                return new k[this.$flowArray.length];
                            }
                        }

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @e(c = "io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$$inlined$combine$1$3", f = "Participant.kt", l = {292}, m = "invokeSuspend")
                        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {TokenNames.T, TokenNames.R, "Lir/j;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
                        /* renamed from: io.livekit.android.room.participant.Participant$trackUpdateFlow$lambda$3$$inlined$combine$1$3, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass3 extends i implements q {
                            private /* synthetic */ Object L$0;
                            /* synthetic */ Object L$1;
                            int label;

                            public AnonymousClass3(c cVar) {
                                super(3, cVar);
                            }

                            @Override // ho.q
                            public final Object invoke(j jVar, k[] kVarArr, c<? super z> cVar) {
                                AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
                                anonymousClass3.L$0 = jVar;
                                anonymousClass3.L$1 = kVarArr;
                                return anonymousClass3.invokeSuspend(z.f31622a);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                int i10 = this.label;
                                if (i10 != 0) {
                                    if (i10 == 1) {
                                        a.g(obj);
                                    } else {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    a.g(obj);
                                    j jVar = (j) this.L$0;
                                    List d12 = tn.n.d1((k[]) ((Object[]) this.L$1));
                                    this.label = 1;
                                    Object emit = jVar.emit(d12, this);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
                                    }
                                }
                                return z.f31622a;
                            }
                        }

                        @Override // ir.i
                        public Object collect(j jVar2, c cVar) {
                            ir.i[] iVarArr2 = iVarArr;
                            Object a10 = b.a(new AnonymousClass2(iVarArr2), new AnonymousClass3(null), jVar2, cVar, iVarArr2);
                            if (a10 == xn.a.f37986a) {
                                return a10;
                            }
                            return z.f31622a;
                        }
                    };
                } else {
                    c6.l("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return null;
                }
            }
            this.label = 1;
            Object r10 = r.r(jVar, iVar, this);
            xn.a aVar = xn.a.f37986a;
            if (r10 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((j) obj, (Map<String, ? extends TrackPublication>) obj2, (c<? super z>) obj3);
    }
}
