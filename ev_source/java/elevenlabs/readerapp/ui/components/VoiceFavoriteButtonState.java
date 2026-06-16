package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;", "", "Favorite", "NonFavorite", "Loading", "Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$Favorite;", "Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$Loading;", "Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$NonFavorite;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface VoiceFavoriteButtonState {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$Favorite;", "Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;", "Lp3/x;", "color", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$Favorite;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Favorite implements VoiceFavoriteButtonState {
        public static final int $stable = 0;
        private final long color;

        private Favorite(long j4) {
            this.color = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Favorite m1096copy8_81llA$default(Favorite favorite, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = favorite.color;
            }
            return favorite.m1098copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Favorite m1098copy8_81llA(long color) {
            return new Favorite(color, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Favorite) && p3.x.c(this.color, ((Favorite) other).color)) {
                return true;
            }
            return false;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m1099getColor0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            long j4 = this.color;
            int i10 = p3.x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return defpackage.f.C("Favorite(color=", p3.x.i(this.color), Separators.RPAREN);
        }

        public /* synthetic */ Favorite(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$Loading;", "Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;", "Lp3/x;", "color", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$Loading;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Loading implements VoiceFavoriteButtonState {
        public static final int $stable = 0;
        private final long color;

        private Loading(long j4) {
            this.color = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Loading m1100copy8_81llA$default(Loading loading, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = loading.color;
            }
            return loading.m1102copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Loading m1102copy8_81llA(long color) {
            return new Loading(color, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Loading) && p3.x.c(this.color, ((Loading) other).color)) {
                return true;
            }
            return false;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m1103getColor0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            long j4 = this.color;
            int i10 = p3.x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return defpackage.f.C("Loading(color=", p3.x.i(this.color), Separators.RPAREN);
        }

        public /* synthetic */ Loading(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$NonFavorite;", "Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState;", "Lp3/x;", "color", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/readerapp/ui/components/VoiceFavoriteButtonState$NonFavorite;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class NonFavorite implements VoiceFavoriteButtonState {
        public static final int $stable = 0;
        private final long color;

        private NonFavorite(long j4) {
            this.color = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ NonFavorite m1104copy8_81llA$default(NonFavorite nonFavorite, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = nonFavorite.color;
            }
            return nonFavorite.m1106copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final NonFavorite m1106copy8_81llA(long color) {
            return new NonFavorite(color, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof NonFavorite) && p3.x.c(this.color, ((NonFavorite) other).color)) {
                return true;
            }
            return false;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m1107getColor0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            long j4 = this.color;
            int i10 = p3.x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return defpackage.f.C("NonFavorite(color=", p3.x.i(this.color), Separators.RPAREN);
        }

        public /* synthetic */ NonFavorite(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }
}
