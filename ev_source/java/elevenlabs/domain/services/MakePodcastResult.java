package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import defpackage.f;
import io.elevenlabs.domain.model.LimitReachedData;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/MakePodcastResult;", "", "Success", "LimitReached", "Lio/elevenlabs/domain/services/MakePodcastResult$LimitReached;", "Lio/elevenlabs/domain/services/MakePodcastResult$Success;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface MakePodcastResult {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/services/MakePodcastResult$LimitReached;", "Lio/elevenlabs/domain/services/MakePodcastResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/LimitReachedData;", "<init>", "(Lio/elevenlabs/domain/model/LimitReachedData;)V", "getData", "()Lio/elevenlabs/domain/model/LimitReachedData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class LimitReached implements MakePodcastResult {
        private final LimitReachedData data;

        public LimitReached(LimitReachedData limitReachedData) {
            limitReachedData.getClass();
            this.data = limitReachedData;
        }

        public static /* synthetic */ LimitReached copy$default(LimitReached limitReached, LimitReachedData limitReachedData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                limitReachedData = limitReached.data;
            }
            return limitReached.copy(limitReachedData);
        }

        /* renamed from: component1, reason: from getter */
        public final LimitReachedData getData() {
            return this.data;
        }

        public final LimitReached copy(LimitReachedData data) {
            data.getClass();
            return new LimitReached(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof LimitReached) && m.c(this.data, ((LimitReached) other).data)) {
                return true;
            }
            return false;
        }

        public final LimitReachedData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "LimitReached(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/services/MakePodcastResult$Success;", "Lio/elevenlabs/domain/services/MakePodcastResult;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success implements MakePodcastResult {
        private final String readId;

        public Success(String str) {
            str.getClass();
            this.readId = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.readId;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReadId() {
            return this.readId;
        }

        public final Success copy(String readId) {
            readId.getClass();
            return new Success(readId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Success) && m.c(this.readId, ((Success) other).readId)) {
                return true;
            }
            return false;
        }

        public final String getReadId() {
            return this.readId;
        }

        public int hashCode() {
            return this.readId.hashCode();
        }

        public String toString() {
            return f.C("Success(readId=", this.readId, Separators.RPAREN);
        }
    }
}
