package io.elevenlabs.readerapp.core.router;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.Analytics;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation;", "", "Hidden", "Shown", "Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation$Hidden;", "Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation$Shown;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ClearPlayerQueueConfirmation {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation$Hidden;", "Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Hidden implements ClearPlayerQueueConfirmation {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        private Hidden() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Hidden)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1288838309;
        }

        public String toString() {
            return "Hidden";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006%"}, d2 = {"Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation$Shown;", "Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation;", "readsRemaining", "", "queueSize", "readId", "", "playerActivationSource", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "addToQueueSource", "Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "collectionId", "<init>", "(IILjava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;Ljava/lang/String;)V", "getReadsRemaining", "()I", "getQueueSize", "getReadId", "()Ljava/lang/String;", "getPlayerActivationSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "getAddToQueueSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "getCollectionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Shown implements ClearPlayerQueueConfirmation {
        public static final int $stable = 0;
        private final Analytics.Event.PlayerAddToQueueClicked.Source addToQueueSource;
        private final String collectionId;
        private final Analytics.Event.PlayerActivationSource playerActivationSource;
        private final int queueSize;
        private final String readId;
        private final int readsRemaining;

        public Shown(int i10, int i11, String str, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source source, String str2) {
            str.getClass();
            playerActivationSource.getClass();
            source.getClass();
            this.readsRemaining = i10;
            this.queueSize = i11;
            this.readId = str;
            this.playerActivationSource = playerActivationSource;
            this.addToQueueSource = source;
            this.collectionId = str2;
        }

        public static /* synthetic */ Shown copy$default(Shown shown, int i10, int i11, String str, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source source, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = shown.readsRemaining;
            }
            if ((i12 & 2) != 0) {
                i11 = shown.queueSize;
            }
            if ((i12 & 4) != 0) {
                str = shown.readId;
            }
            if ((i12 & 8) != 0) {
                playerActivationSource = shown.playerActivationSource;
            }
            if ((i12 & 16) != 0) {
                source = shown.addToQueueSource;
            }
            if ((i12 & 32) != 0) {
                str2 = shown.collectionId;
            }
            Analytics.Event.PlayerAddToQueueClicked.Source source2 = source;
            String str3 = str2;
            return shown.copy(i10, i11, str, playerActivationSource, source2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getReadsRemaining() {
            return this.readsRemaining;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQueueSize() {
            return this.queueSize;
        }

        /* renamed from: component3, reason: from getter */
        public final String getReadId() {
            return this.readId;
        }

        /* renamed from: component4, reason: from getter */
        public final Analytics.Event.PlayerActivationSource getPlayerActivationSource() {
            return this.playerActivationSource;
        }

        /* renamed from: component5, reason: from getter */
        public final Analytics.Event.PlayerAddToQueueClicked.Source getAddToQueueSource() {
            return this.addToQueueSource;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCollectionId() {
            return this.collectionId;
        }

        public final Shown copy(int readsRemaining, int queueSize, String readId, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source addToQueueSource, String collectionId) {
            readId.getClass();
            playerActivationSource.getClass();
            addToQueueSource.getClass();
            return new Shown(readsRemaining, queueSize, readId, playerActivationSource, addToQueueSource, collectionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shown)) {
                return false;
            }
            Shown shown = (Shown) other;
            if (this.readsRemaining == shown.readsRemaining && this.queueSize == shown.queueSize && kotlin.jvm.internal.m.c(this.readId, shown.readId) && this.playerActivationSource == shown.playerActivationSource && this.addToQueueSource == shown.addToQueueSource && kotlin.jvm.internal.m.c(this.collectionId, shown.collectionId)) {
                return true;
            }
            return false;
        }

        public final Analytics.Event.PlayerAddToQueueClicked.Source getAddToQueueSource() {
            return this.addToQueueSource;
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public final Analytics.Event.PlayerActivationSource getPlayerActivationSource() {
            return this.playerActivationSource;
        }

        public final int getQueueSize() {
            return this.queueSize;
        }

        public final String getReadId() {
            return this.readId;
        }

        public final int getReadsRemaining() {
            return this.readsRemaining;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.addToQueueSource.hashCode() + ((this.playerActivationSource.hashCode() + j0.c.c(j0.c.b(this.queueSize, Integer.hashCode(this.readsRemaining) * 31, 31), 31, this.readId)) * 31)) * 31;
            String str = this.collectionId;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            int i10 = this.readsRemaining;
            int i11 = this.queueSize;
            String str = this.readId;
            Analytics.Event.PlayerActivationSource playerActivationSource = this.playerActivationSource;
            Analytics.Event.PlayerAddToQueueClicked.Source source = this.addToQueueSource;
            String str2 = this.collectionId;
            StringBuilder g10 = z.h.g("Shown(readsRemaining=", i10, ", queueSize=", i11, ", readId=");
            g10.append(str);
            g10.append(", playerActivationSource=");
            g10.append(playerActivationSource);
            g10.append(", addToQueueSource=");
            g10.append(source);
            g10.append(", collectionId=");
            g10.append(str2);
            g10.append(Separators.RPAREN);
            return g10.toString();
        }
    }
}
