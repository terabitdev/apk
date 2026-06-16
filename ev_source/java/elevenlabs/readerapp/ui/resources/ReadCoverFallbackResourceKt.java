package io.elevenlabs.readerapp.ui.resources;

import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"readCoverFallbackResource", "", "source", "Lio/elevenlabs/domain/model/ReadSource;", "originalFileType", "", "(Lio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;)Ljava/lang/Integer;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadCoverFallbackResourceKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadSource.values().length];
            try {
                iArr[ReadSource.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadSource.File.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadSource.Website.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadSource.Book.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadSource.Podcast.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadSource.Bulletin.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r4.equals("text/plain") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return java.lang.Integer.valueOf(io.elevenlabs.ui.R.drawable.cover_text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r4.equals("text/x-markdown") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r4.equals("text/markdown") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer readCoverFallbackResource(ReadSource readSource, String str) {
        int i10;
        int i11 = -1;
        if (readSource == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[readSource.ordinal()];
        }
        if (i10 != 5 && i10 != 6) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -2008589971:
                        if (str.equals("application/epub+zip")) {
                            return Integer.valueOf(R.drawable.cover_file);
                        }
                        break;
                    case -1248334925:
                        if (str.equals("application/pdf")) {
                            return Integer.valueOf(R.drawable.cover_pdf);
                        }
                        break;
                    case -1082243251:
                        if (str.equals("text/html")) {
                            return Integer.valueOf(R.drawable.cover_website);
                        }
                        break;
                    case -533161071:
                        break;
                    case 352322758:
                        break;
                    case 817335912:
                        break;
                }
            }
            if (readSource != null) {
                i11 = WhenMappings.$EnumSwitchMapping$0[readSource.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return null;
                        }
                        return Integer.valueOf(R.drawable.cover_file);
                    }
                    return Integer.valueOf(R.drawable.cover_website);
                }
                return Integer.valueOf(R.drawable.cover_file);
            }
            return Integer.valueOf(R.drawable.cover_text);
        }
        return Integer.valueOf(R.drawable.cover_genfm);
    }
}
