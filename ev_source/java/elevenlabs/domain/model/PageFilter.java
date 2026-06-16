package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/PageFilter;", "", "Companion", "ExplorePageOneOptionFilterResponseModel", "ExplorePageMultiOptionFilterResponseModel", "Lio/elevenlabs/domain/model/PageFilter$ExplorePageMultiOptionFilterResponseModel;", "Lio/elevenlabs/domain/model/PageFilter$ExplorePageOneOptionFilterResponseModel;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PageFilter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String KEY_CONTENT_LANGUAGE = "content_language";

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/domain/model/PageFilter$Companion;", "", "<init>", "()V", "KEY_CONTENT_LANGUAGE", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_CONTENT_LANGUAGE = "content_language";

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/PageFilter$ExplorePageMultiOptionFilterResponseModel;", "Lio/elevenlabs/domain/model/PageFilter;", "title", "", SubscriberAttributeKt.JSON_NAME_KEY, "options", "", "Lio/elevenlabs/domain/model/KeyLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getKey", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ExplorePageMultiOptionFilterResponseModel implements PageFilter {
        private final String key;
        private final List<KeyLabel> options;
        private final String title;

        public ExplorePageMultiOptionFilterResponseModel(String str, String str2, List<KeyLabel> list) {
            c.w(str, str2, list);
            this.title = str;
            this.key = str2;
            this.options = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExplorePageMultiOptionFilterResponseModel copy$default(ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = explorePageMultiOptionFilterResponseModel.title;
            }
            if ((i10 & 2) != 0) {
                str2 = explorePageMultiOptionFilterResponseModel.key;
            }
            if ((i10 & 4) != 0) {
                list = explorePageMultiOptionFilterResponseModel.options;
            }
            return explorePageMultiOptionFilterResponseModel.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public final List<KeyLabel> component3() {
            return this.options;
        }

        public final ExplorePageMultiOptionFilterResponseModel copy(String title, String key, List<KeyLabel> options) {
            title.getClass();
            key.getClass();
            options.getClass();
            return new ExplorePageMultiOptionFilterResponseModel(title, key, options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExplorePageMultiOptionFilterResponseModel)) {
                return false;
            }
            ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel = (ExplorePageMultiOptionFilterResponseModel) other;
            if (m.c(this.title, explorePageMultiOptionFilterResponseModel.title) && m.c(this.key, explorePageMultiOptionFilterResponseModel.key) && m.c(this.options, explorePageMultiOptionFilterResponseModel.options)) {
                return true;
            }
            return false;
        }

        public final String getKey() {
            return this.key;
        }

        public final List<KeyLabel> getOptions() {
            return this.options;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.options.hashCode() + c.c(this.title.hashCode() * 31, 31, this.key);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.key;
            return h.e(f.s("ExplorePageMultiOptionFilterResponseModel(title=", str, ", key=", str2, ", options="), this.options, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/domain/model/PageFilter$ExplorePageOneOptionFilterResponseModel;", "Lio/elevenlabs/domain/model/PageFilter;", "title", "", SubscriberAttributeKt.JSON_NAME_KEY, "options", "", "Lio/elevenlabs/domain/model/KeyLabel;", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/elevenlabs/domain/model/KeyLabel;)V", "getTitle", "()Ljava/lang/String;", "getKey", "getOptions", "()Ljava/util/List;", "getSelected", "()Lio/elevenlabs/domain/model/KeyLabel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ExplorePageOneOptionFilterResponseModel implements PageFilter {
        private final String key;
        private final List<KeyLabel> options;
        private final KeyLabel selected;
        private final String title;

        public ExplorePageOneOptionFilterResponseModel(String str, String str2, List<KeyLabel> list, KeyLabel keyLabel) {
            c.w(str, str2, list);
            this.title = str;
            this.key = str2;
            this.options = list;
            this.selected = keyLabel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExplorePageOneOptionFilterResponseModel copy$default(ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel, String str, String str2, List list, KeyLabel keyLabel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = explorePageOneOptionFilterResponseModel.title;
            }
            if ((i10 & 2) != 0) {
                str2 = explorePageOneOptionFilterResponseModel.key;
            }
            if ((i10 & 4) != 0) {
                list = explorePageOneOptionFilterResponseModel.options;
            }
            if ((i10 & 8) != 0) {
                keyLabel = explorePageOneOptionFilterResponseModel.selected;
            }
            return explorePageOneOptionFilterResponseModel.copy(str, str2, list, keyLabel);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public final List<KeyLabel> component3() {
            return this.options;
        }

        /* renamed from: component4, reason: from getter */
        public final KeyLabel getSelected() {
            return this.selected;
        }

        public final ExplorePageOneOptionFilterResponseModel copy(String title, String key, List<KeyLabel> options, KeyLabel selected) {
            title.getClass();
            key.getClass();
            options.getClass();
            return new ExplorePageOneOptionFilterResponseModel(title, key, options, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExplorePageOneOptionFilterResponseModel)) {
                return false;
            }
            ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel = (ExplorePageOneOptionFilterResponseModel) other;
            if (m.c(this.title, explorePageOneOptionFilterResponseModel.title) && m.c(this.key, explorePageOneOptionFilterResponseModel.key) && m.c(this.options, explorePageOneOptionFilterResponseModel.options) && m.c(this.selected, explorePageOneOptionFilterResponseModel.selected)) {
                return true;
            }
            return false;
        }

        public final String getKey() {
            return this.key;
        }

        public final List<KeyLabel> getOptions() {
            return this.options;
        }

        public final KeyLabel getSelected() {
            return this.selected;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int d10 = n.d(c.c(this.title.hashCode() * 31, 31, this.key), 31, this.options);
            KeyLabel keyLabel = this.selected;
            if (keyLabel == null) {
                hashCode = 0;
            } else {
                hashCode = keyLabel.hashCode();
            }
            return d10 + hashCode;
        }

        public String toString() {
            String str = this.title;
            String str2 = this.key;
            List<KeyLabel> list = this.options;
            KeyLabel keyLabel = this.selected;
            StringBuilder s10 = f.s("ExplorePageOneOptionFilterResponseModel(title=", str, ", key=", str2, ", options=");
            s10.append(list);
            s10.append(", selected=");
            s10.append(keyLabel);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }

        public /* synthetic */ ExplorePageOneOptionFilterResponseModel(String str, String str2, List list, KeyLabel keyLabel, int i10, kotlin.jvm.internal.f fVar) {
            this(str, str2, list, (i10 & 8) != 0 ? null : keyLabel);
        }
    }
}
