package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import fr.e1;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CharacterReportingService;
import ir.i1;
import ir.k1;
import ir.n1;
import ir.q1;
import ir.r;
import ir.t1;
import ir.u;
import ir.w;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/elevenlabs/data/services/CharacterReportingServiceImpl;", "Lio/elevenlabs/domain/services/CharacterReportingService;", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/Logger;)V", "Lir/i;", "", "subscribeToCharacterUpdates", "()Lir/i;", "position", "Lsn/z;", "updateCurrentPosition", "(J)V", "getCurrentPosition", "()J", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "Lir/i1;", "_characterPositions", "Lir/i1;", "Lir/n1;", "characterUpdatesSharedFlow", "Lir/n1;", "Lir/z1;", "", "hasActiveSubscribers", "Lir/z1;", "getHasActiveSubscribers", "()Lir/z1;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CharacterReportingServiceImpl implements CharacterReportingService {
    private final i1 _characterPositions;
    private final n1 characterUpdatesSharedFlow;
    private final z1 hasActiveSubscribers;
    private final Logger logger;
    private final String tag;

    public CharacterReportingServiceImpl(Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.tag = "CharacterReportingService";
        q1 b10 = r.b(1, 16, null, 4);
        this._characterPositions = b10;
        this.characterUpdatesSharedFlow = new k1(b10);
        final z1 subscriptionCount = b10.getSubscriptionCount();
        this.hasActiveSubscribers = r.E(r.o(new ir.i() { // from class: io.elevenlabs.data.services.CharacterReportingServiceImpl$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.CharacterReportingServiceImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ CharacterReportingServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.CharacterReportingServiceImpl$special$$inlined$map$1$2", f = "CharacterReportingServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.CharacterReportingServiceImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
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

                public AnonymousClass2(ir.j jVar, CharacterReportingServiceImpl characterReportingServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = characterReportingServiceImpl;
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
                    Logger logger;
                    String str;
                    boolean z6;
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
                                ir.j jVar = this.$this_unsafeFlow;
                                int intValue = ((Number) obj).intValue();
                                logger = this.this$0.logger;
                                str = this.this$0.tag;
                                logger.log(str, "Subscription count changed to: " + intValue);
                                if (intValue > 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z6);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(valueOf, anonymousClass1);
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
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }), e1.f9817a, t1.f18063a, Boolean.FALSE);
    }

    @Override // io.elevenlabs.domain.services.CharacterReportingService
    public long getCurrentPosition() {
        Long l4 = (Long) o.y0(this._characterPositions.getReplayCache());
        if (l4 != null) {
            return l4.longValue();
        }
        return 0L;
    }

    @Override // io.elevenlabs.domain.services.CharacterReportingService
    public z1 getHasActiveSubscribers() {
        return this.hasActiveSubscribers;
    }

    @Override // io.elevenlabs.domain.services.CharacterReportingService
    public ir.i subscribeToCharacterUpdates() {
        return new u(new w(new CharacterReportingServiceImpl$subscribeToCharacterUpdates$1(this, null), r.o(this.characterUpdatesSharedFlow)), new CharacterReportingServiceImpl$subscribeToCharacterUpdates$2(this, null));
    }

    @Override // io.elevenlabs.domain.services.CharacterReportingService
    public void updateCurrentPosition(long position) {
        if (!this._characterPositions.tryEmit(Long.valueOf(position))) {
            this.logger.log(this.tag, android.gov.nist.javax.sip.header.a.k("Failed to emit character position: ", position, " (buffer full)"));
        }
    }
}
