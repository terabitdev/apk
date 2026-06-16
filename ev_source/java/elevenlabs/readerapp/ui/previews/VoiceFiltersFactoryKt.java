package io.elevenlabs.readerapp.ui.previews;

import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import ig.f;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.model.Filter;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"stubVoiceFilters", "Lio/elevenlabs/domain/model/AvailableFilters;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceFiltersFactoryKt {
    public static final AvailableFilters stubVoiceFilters() {
        List I = f.I(new Filter.Default("1", "Sort 1"), new Filter.Default("2", "Sort 2"), new Filter.Default("3", "Sort 3"));
        List I2 = f.I(new Filter.Default("ar", "Arabic"), new Filter.Default("bg", "Bulgarian"), new Filter.Default("ca", "Catalan"), new Filter.Default("zh", "Chinese"), new Filter.Default("hr", "Croatian"), new Filter.Default("cs", "Czech"), new Filter.Default("da", "Danish"), new Filter.Default("en", "English"), new Filter.Default("fi", "Finnish"), new Filter.Default("fr", "French"), new Filter.Default("gl", "Galician"), new Filter.Default("de", "German"), new Filter.Default("el", "Greek"), new Filter.Default("he", "Hebrew"), new Filter.Default("hi", "Hindi"), new Filter.Default("hu", "Hungarian"), new Filter.Default("is", "Icelandic"), new Filter.Default("id", "Indonesian"), new Filter.Default("it", "Italian"), new Filter.Default("ja", "Japanese"), new Filter.Default("ko", "Korean"), new Filter.Default("lv", "Latvian"), new Filter.Default("lt", "Lithuanian"), new Filter.Default("mk", "Macedonian"), new Filter.Default("ms", "Malay"), new Filter.Default(AuthorizationHeaderIms.NO, "Norwegian"), new Filter.Default("pl", "Polish"), new Filter.Default("pt", "Portuguese"), new Filter.Default("ro", "Romanian"), new Filter.Default("ru", "Russian"), new Filter.Default("sr", "Serbian"), new Filter.Default("sk", "Slovak"), new Filter.Default("sl", "Slovenian"), new Filter.Default("es", "Spanish"), new Filter.Default("sv", "Swedish"), new Filter.Default("th", "Thai"), new Filter.Default("tr", "Turkish"), new Filter.Default("tr", "Turkish"), new Filter.Default("uk", "Ukrainian"), new Filter.Default("vi", "Vietnamese"));
        List I3 = f.I(new Filter.Default("1", "Use Case 1"), new Filter.Default("2", "Use Case 2"), new Filter.Default("3", "Use Case 3"));
        return new AvailableFilters(f.I(new Filter.Default("1", "Age 1"), new Filter.Default("2", "Age 2"), new Filter.Default("3", "Age 3")), f.I(new Filter.Default("1", "Category 1"), new Filter.Default("2", "Category 2"), new Filter.Default("3", "Category 3"), new Filter.Default("3", "Category 4"), new Filter.Default("3", "Category 5")), f.I(new Filter.Default("1", "Gender 1"), new Filter.Default("2", "Gender 2"), new Filter.Default("3", "Gender 3")), I2, I, I3, f.I(new Filter.Default("1", "Accent 1"), new Filter.Default("2", "Accent 2"), new Filter.Default("3", "Accent 3")));
    }
}
