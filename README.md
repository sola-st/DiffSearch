# DiffSearch

The goal of this project is to design, implement, and evaluate a search
engine for code changes. Similar to traditional search engines, e.g., for the
web, the approach consists of two main components. At first, an indexing
component scans a large number of version histories and extracts relevant
information about each code change. Then, a querying component matches
a query for a specific kind of code change against all indexed changes and
retrieves a ranked list of changes that match the query.