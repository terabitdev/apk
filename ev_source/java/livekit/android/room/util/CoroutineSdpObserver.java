package io.livekit.android.room.util;

import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import fr.g0;
import fr.n;
import gg.b;
import io.livekit.android.util.Either;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.SdpObserver;
import livekit.org.webrtc.SessionDescription;
import or.a;
import or.d;
import sn.z;
import wn.c;
import wn.i;
import wn.j;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015RD\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000f2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f0\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eRD\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000f2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR0\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f0\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lio/livekit/android/room/util/CoroutineSdpObserver;", "Llivekit/org/webrtc/SdpObserver;", "<init>", "()V", "Llivekit/org/webrtc/SessionDescription;", SIPServerTransaction.CONTENT_SUBTYPE_SDP, "Lsn/z;", "onCreateSuccess", "(Llivekit/org/webrtc/SessionDescription;)V", "onSetSuccess", "", "message", "onCreateFailure", "(Ljava/lang/String;)V", "onSetFailure", "Lio/livekit/android/util/Either;", "awaitCreate", "(Lwn/c;)Ljava/lang/Object;", "awaitSet", "Lor/a;", "stateLock", "Lor/a;", "value", "createOutcome", "Lio/livekit/android/util/Either;", "setCreateOutcome", "(Lio/livekit/android/util/Either;)V", "", "Lwn/c;", "pendingCreate", "Ljava/util/List;", "setOutcome", "setSetOutcome", "pendingSets", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class CoroutineSdpObserver implements SdpObserver {
    private Either<? extends SessionDescription, String> createOutcome;
    private Either<z, String> setOutcome;
    private final a stateLock = d.a();
    private List<c<Either<? extends SessionDescription, String>>> pendingCreate = new ArrayList();
    private List<c<Either<z, String>>> pendingSets = new ArrayList();

    private final void setCreateOutcome(Either<? extends SessionDescription, String> either) {
        List list = (List) g0.I(i.f37087a, new CoroutineSdpObserver$createOutcome$conts$1(this, either, null));
        if (either != null && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).resumeWith(either);
            }
        }
    }

    private final void setSetOutcome(Either<z, String> either) {
        List list = (List) g0.I(i.f37087a, new CoroutineSdpObserver$setOutcome$conts$1(this, either, null));
        if (either != null && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).resumeWith(either);
            }
        }
    }

    public final Object awaitCreate(c<? super Either<? extends SessionDescription, String>> cVar) {
        n nVar = new n(1, b.V(cVar));
        nVar.t();
        Either either = this.createOutcome;
        if (either == null) {
            g0.I(i.f37087a, new CoroutineSdpObserver$awaitCreate$2$1(this, nVar, null));
        } else {
            nVar.resumeWith(either);
        }
        return nVar.s();
    }

    public final Object awaitSet(c<? super Either<z, String>> cVar) {
        j jVar = new j(b.V(cVar), xn.a.f37987b);
        Either<z, String> either = this.setOutcome;
        if (either == null) {
            g0.I(i.f37087a, new CoroutineSdpObserver$awaitSet$2$1(this, jVar, null));
        } else {
            jVar.resumeWith(either);
        }
        return jVar.b();
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onCreateFailure(String message) {
        setCreateOutcome(new Either.Right(message));
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sdp) {
        Either<? extends SessionDescription, String> left;
        if (sdp == null) {
            left = new Either.Right<>("empty sdp");
        } else {
            left = new Either.Left(sdp);
        }
        setCreateOutcome(left);
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onSetFailure(String message) {
        setSetOutcome(new Either.Right(message));
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onSetSuccess() {
        setSetOutcome(new Either.Left(z.f31622a));
    }
}
