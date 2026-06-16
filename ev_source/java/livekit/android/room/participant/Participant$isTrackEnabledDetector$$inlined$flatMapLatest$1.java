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
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.k;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.Participant$isTrackEnabledDetector$$inlined$flatMapLatest$1", f = "Participant.kt", l = {190}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {TokenNames.T, TokenNames.R, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Participant$isTrackEnabledDetector$$inlined$flatMapLatest$1 extends i implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public Participant$isTrackEnabledDetector$$inlined$flatMapLatest$1(c cVar) {
        super(3, cVar);
    }

    public final Object invoke(j jVar, k kVar, c<? super z> cVar) {
        Participant$isTrackEnabledDetector$$inlined$flatMapLatest$1 participant$isTrackEnabledDetector$$inlined$flatMapLatest$1 = new Participant$isTrackEnabledDetector$$inlined$flatMapLatest$1(cVar);
        participant$isTrackEnabledDetector$$inlined$flatMapLatest$1.L$0 = jVar;
        participant$isTrackEnabledDetector$$inlined$flatMapLatest$1.L$1 = kVar;
        return participant$isTrackEnabledDetector$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
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
            k kVar = (k) this.L$1;
            final TrackPublication trackPublication = (TrackPublication) kVar.f31600a;
            final Track track = (Track) kVar.f31601b;
            if (trackPublication == null) {
                iVar = new u(new k(Boolean.FALSE, track), 3);
            } else {
                final z1 flow = FlowDelegateKt.getFlow(new p(trackPublication) { // from class: io.livekit.android.room.participant.Participant$isTrackEnabledDetector$1$1
                    @Override // kotlin.jvm.internal.p, oo.r
                    public Object get() {
                        return Boolean.valueOf(((TrackPublication) this.receiver).getMuted());
                    }

                    public void set(Object obj2) {
                        ((TrackPublication) this.receiver).setMuted$livekit_android_sdk_release(((Boolean) obj2).booleanValue());
                    }
                });
                iVar = new ir.i() { // from class: io.livekit.android.room.participant.Participant$isTrackEnabledDetector$lambda$16$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: io.livekit.android.room.participant.Participant$isTrackEnabledDetector$lambda$16$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;
                        final /* synthetic */ Track $track$inlined;

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @e(c = "io.livekit.android.room.participant.Participant$isTrackEnabledDetector$lambda$16$$inlined$map$1$2", f = "Participant.kt", l = {223}, m = "emit")
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.livekit.android.room.participant.Participant$isTrackEnabledDetector$lambda$16$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(j jVar, Track track) {
                            this.$this_unsafeFlow = jVar;
                            this.$track$inlined = track;
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
                                        k kVar = new k(Boolean.valueOf(((Boolean) obj).booleanValue()), this.$track$inlined);
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
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar2, track), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                };
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
        return invoke((j) obj, (k) obj2, (c<? super z>) obj3);
    }
}
