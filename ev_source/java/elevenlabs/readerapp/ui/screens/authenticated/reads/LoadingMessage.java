package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/LoadingMessage;", "", "Lxq/b;", "delay", "", "message", "<init>", "(JLjava/lang/Integer;Lkotlin/jvm/internal/f;)V", "component1-UwyO8pc", "()J", "component1", "component2", "()Ljava/lang/Integer;", "copy-VtjQ1oo", "(JLjava/lang/Integer;)Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/LoadingMessage;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDelay-UwyO8pc", "Ljava/lang/Integer;", "getMessage", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class LoadingMessage {
    private final long delay;
    private final Integer message;

    private LoadingMessage(long j4, Integer num) {
        this.delay = j4;
        this.message = num;
    }

    /* renamed from: copy-VtjQ1oo$default, reason: not valid java name */
    public static /* synthetic */ LoadingMessage m1687copyVtjQ1oo$default(LoadingMessage loadingMessage, long j4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = loadingMessage.delay;
        }
        if ((i10 & 2) != 0) {
            num = loadingMessage.message;
        }
        return loadingMessage.m1689copyVtjQ1oo(j4, num);
    }

    /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
    public final long getDelay() {
        return this.delay;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMessage() {
        return this.message;
    }

    /* renamed from: copy-VtjQ1oo, reason: not valid java name */
    public final LoadingMessage m1689copyVtjQ1oo(long delay, Integer message) {
        return new LoadingMessage(delay, message, null);
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof LoadingMessage) {
                LoadingMessage loadingMessage = (LoadingMessage) other;
                long j4 = this.delay;
                long j10 = loadingMessage.delay;
                xq.a aVar = xq.b.f38124b;
                if (j4 == j10 && kotlin.jvm.internal.m.c(this.message, loadingMessage.message)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: getDelay-UwyO8pc, reason: not valid java name */
    public final long m1690getDelayUwyO8pc() {
        return this.delay;
    }

    public final Integer getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        long j4 = this.delay;
        xq.a aVar = xq.b.f38124b;
        int hashCode2 = Long.hashCode(j4) * 31;
        Integer num = this.message;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "LoadingMessage(delay=" + xq.b.j(this.delay) + ", message=" + this.message + Separators.RPAREN;
    }

    public /* synthetic */ LoadingMessage(long j4, Integer num, kotlin.jvm.internal.f fVar) {
        this(j4, num);
    }
}
